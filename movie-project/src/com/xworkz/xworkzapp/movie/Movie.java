package com.xworkz.xworkzapp.movie;

public class Movie {
	private String movieName;
	private String dirName;
	private String heroName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	/*
	 * @Override public String toString() { return "Movie [movieName=" + movieName +
	 * ", " + "dirName=" + dirName + ", heroName=" + heroName + "]"; }
	 */
	
	
	@Override
	public String toString() {
		return "Movie [movieName="+movieName+","+"dirName="+dirName+", heroName="+heroName+"]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((dirName == null) ? 0 : dirName.hashCode());
//		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
//		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
//		return result;
//	}
	
	@Override
	public int hashCode() {
	return 0;	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (heroName == null) {
			return true;
		}
		if (movieName == null) {
			return true;
				
	}
		return false;
	}
}
	

