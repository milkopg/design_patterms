package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m5_concurrent_collections;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.Action;

import design_patterns.com.milko.training.java_patterns_concurrency_advanced.m5_concurrent_collections.model.Actor;
import design_patterns.com.milko.training.java_patterns_concurrency_advanced.m5_concurrent_collections.model.Movie;
import design_patterns.com.milko.training.java_patterns_concurrency_advanced.m5_concurrent_collections.model.MovieReader;

public class ConcurrentHashMapParallelPatterns {
	public static void main(String[] args) {
		ConcurrentHashMap<Actor, Set<Movie>> map = new ConcurrentHashMap<>();
		MovieReader reader = new MovieReader();
		reader.addActorsToMap(map);
		
		System.out.println("# Actors = " + map.size());
		
		int maxMovieForOneActor = map.reduce(10, (action, movies) -> movies.size(), Integer::max);
		System.out.println("Max movies for one actor = " + maxMovieForOneActor);
		
		Actor mostSeenActor = map.search(10, (actor, movies) -> movies.size() == maxMovieForOneActor ? actor : null);
		System.out.println("Most seen action: " + mostSeenActor);
		
		int numberOfMoviesReferences = map.reduce(10, (actor, movies) -> movies.size() , Integer::sum);
		System.out.println("Average movies per actor = " + numberOfMoviesReferences/map.size());
	}
}
