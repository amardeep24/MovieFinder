package com.amardeep.movie.entity;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie implements Comparable<Movie> {
	@JsonProperty("Title")
	private String title;
	@JsonProperty("Year")
	private String year;
	@JsonProperty("Rated")
	private String rated;
	@JsonProperty("Released")
	private String released;
	@JsonProperty("Runtime")
	private String runtime;
	@JsonProperty("Genre")
	private String genre;
	@JsonProperty("Director")
	private String director;
	@JsonProperty("Writer")
	private String writer;
	@JsonProperty("Actors")
	private String actor;
	@JsonProperty("Plot")
	private String plot;
	@JsonProperty("Language")
	private String language;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Awards")
	private String awards;
	@JsonProperty("Poster")
	private String poster;
	@JsonProperty("Ratings")
	private Rating[] ratings;
	@JsonProperty("Metascore")
	private String metaScore;
	private String imdbRating;
	private String imdbVotes;
	@JsonProperty("imdbID")
	private String imdbId;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("DVD")
	private String dvd;
	@JsonProperty("BoxOffice")
	private String boxOffice;
	@JsonProperty("Production")
	private String production;
	@JsonProperty("Website")
	private String website;
	@JsonProperty("Response")
	private String response;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the rated
	 */
	public String getRated() {
		return rated;
	}
	/**
	 * @param rated the rated to set
	 */
	public void setRated(String rated) {
		this.rated = rated;
	}
	/**
	 * @return the released
	 */
	public String getReleased() {
		return released;
	}
	/**
	 * @param released the released to set
	 */
	public void setReleased(String released) {
		this.released = released;
	}
	/**
	 * @return the runtime
	 */
	public String getRuntime() {
		return runtime;
	}
	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}
	/**
	 * @return the plot
	 */
	public String getPlot() {
		return plot;
	}
	/**
	 * @param plot the plot to set
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the awards
	 */
	public String getAwards() {
		return awards;
	}
	/**
	 * @param awards the awards to set
	 */
	public void setAwards(String awards) {
		this.awards = awards;
	}
	/**
	 * @return the poster
	 */
	public String getPoster() {
		return poster;
	}
	/**
	 * @param poster the poster to set
	 */
	public void setPoster(String poster) {
		this.poster = poster;
	}
	/**
	 * @return the ratings
	 */
	public Rating[] getRatings() {
		return ratings;
	}
	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(Rating[] ratings) {
		this.ratings = ratings;
	}
	/**
	 * @return the metaScore
	 */
	public String getMetaScore() {
		return metaScore;
	}
	/**
	 * @param metaScore the metaScore to set
	 */
	public void setMetaScore(String metaScore) {
		this.metaScore = metaScore;
	}
	/**
	 * @return the imdbRating
	 */
	public String getImdbRating() {
		return imdbRating;
	}
	/**
	 * @param imdbRating the imdbRating to set
	 */
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	/**
	 * @return the imdbVotes
	 */
	public String getImdbVotes() {
		return imdbVotes;
	}
	/**
	 * @param imdbVotes the imdbVotes to set
	 */
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	/**
	 * @return the imdbId
	 */
	public String getImdbId() {
		return imdbId;
	}
	/**
	 * @param imdbId the imdbId to set
	 */
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the dvd
	 */
	public String getDvd() {
		return dvd;
	}
	/**
	 * @param dvd the dvd to set
	 */
	public void setDvd(String dvd) {
		this.dvd = dvd;
	}
	/**
	 * @return the boxOffice
	 */
	public String getBoxOffice() {
		return boxOffice;
	}
	/**
	 * @param boxOffice the boxOffice to set
	 */
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}
	/**
	 * @return the production
	 */
	public String getProduction() {
		return production;
	}
	/**
	 * @param production the production to set
	 */
	public void setProduction(String production) {
		this.production = production;
	}
	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public int compareTo(Movie movie) {
		if(Objects.nonNull(movie)){
			return this.getTitle().compareTo(movie.getTitle());
		}
		return -1;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actor == null) ? 0 : actor.hashCode());
		result = prime * result + ((awards == null) ? 0 : awards.hashCode());
		result = prime * result + ((boxOffice == null) ? 0 : boxOffice.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((dvd == null) ? 0 : dvd.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((imdbId == null) ? 0 : imdbId.hashCode());
		result = prime * result + ((imdbRating == null) ? 0 : imdbRating.hashCode());
		result = prime * result + ((imdbVotes == null) ? 0 : imdbVotes.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((metaScore == null) ? 0 : metaScore.hashCode());
		result = prime * result + ((plot == null) ? 0 : plot.hashCode());
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		result = prime * result + ((rated == null) ? 0 : rated.hashCode());
		result = prime * result + Arrays.hashCode(ratings);
		result = prime * result + ((released == null) ? 0 : released.hashCode());
		result = prime * result + ((response == null) ? 0 : response.hashCode());
		result = prime * result + ((runtime == null) ? 0 : runtime.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Movie)) {
			return false;
		}
		Movie other = (Movie) obj;
		if (actor == null) {
			if (other.actor != null) {
				return false;
			}
		} else if (!actor.equals(other.actor)) {
			return false;
		}
		if (awards == null) {
			if (other.awards != null) {
				return false;
			}
		} else if (!awards.equals(other.awards)) {
			return false;
		}
		if (boxOffice == null) {
			if (other.boxOffice != null) {
				return false;
			}
		} else if (!boxOffice.equals(other.boxOffice)) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (director == null) {
			if (other.director != null) {
				return false;
			}
		} else if (!director.equals(other.director)) {
			return false;
		}
		if (dvd == null) {
			if (other.dvd != null) {
				return false;
			}
		} else if (!dvd.equals(other.dvd)) {
			return false;
		}
		if (genre == null) {
			if (other.genre != null) {
				return false;
			}
		} else if (!genre.equals(other.genre)) {
			return false;
		}
		if (imdbId == null) {
			if (other.imdbId != null) {
				return false;
			}
		} else if (!imdbId.equals(other.imdbId)) {
			return false;
		}
		if (imdbRating == null) {
			if (other.imdbRating != null) {
				return false;
			}
		} else if (!imdbRating.equals(other.imdbRating)) {
			return false;
		}
		if (imdbVotes == null) {
			if (other.imdbVotes != null) {
				return false;
			}
		} else if (!imdbVotes.equals(other.imdbVotes)) {
			return false;
		}
		if (language == null) {
			if (other.language != null) {
				return false;
			}
		} else if (!language.equals(other.language)) {
			return false;
		}
		if (metaScore == null) {
			if (other.metaScore != null) {
				return false;
			}
		} else if (!metaScore.equals(other.metaScore)) {
			return false;
		}
		if (plot == null) {
			if (other.plot != null) {
				return false;
			}
		} else if (!plot.equals(other.plot)) {
			return false;
		}
		if (poster == null) {
			if (other.poster != null) {
				return false;
			}
		} else if (!poster.equals(other.poster)) {
			return false;
		}
		if (production == null) {
			if (other.production != null) {
				return false;
			}
		} else if (!production.equals(other.production)) {
			return false;
		}
		if (rated == null) {
			if (other.rated != null) {
				return false;
			}
		} else if (!rated.equals(other.rated)) {
			return false;
		}
		if (!Arrays.equals(ratings, other.ratings)) {
			return false;
		}
		if (released == null) {
			if (other.released != null) {
				return false;
			}
		} else if (!released.equals(other.released)) {
			return false;
		}
		if (response == null) {
			if (other.response != null) {
				return false;
			}
		} else if (!response.equals(other.response)) {
			return false;
		}
		if (runtime == null) {
			if (other.runtime != null) {
				return false;
			}
		} else if (!runtime.equals(other.runtime)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		if (website == null) {
			if (other.website != null) {
				return false;
			}
		} else if (!website.equals(other.website)) {
			return false;
		}
		if (writer == null) {
			if (other.writer != null) {
				return false;
			}
		} else if (!writer.equals(other.writer)) {
			return false;
		}
		if (year == null) {
			if (other.year != null) {
				return false;
			}
		} else if (!year.equals(other.year)) {
			return false;
		}
		return true;
	}
	
	

}
