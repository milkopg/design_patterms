package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m5_concurrent_collections.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Movie {

	private String title;
	private int releaseYear;

	private Set<Actor> actors = new HashSet<>();

	public Movie(String title, int releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void addActor(Actor actor) {
		this.actors.add(actor);
	}

	public Set<Actor> getActors() {
		return actors;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 67 * hash + Objects.hashCode(this.title);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Movie other = (Movie) obj;
		return Objects.equals(this.title, other.title);
	}

	@Override
	public String toString() {
		return "Movie{" + "title=" + title + ", releaseYear=" + releaseYear + ", actors=" + actors + '}';
	}
}
