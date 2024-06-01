package nov04ex1;

import java.util.IntSummaryStatistics;
import java.util.Objects;

enum BlogPostType {
	NEWS, REVIEW, GUIDE
}

class BlogPost {
	private String title;
	private String author;
	private BlogPostType type;
	private int likes;

	record AuthPostTypesLikes(String author, BlogPostType type, int likes) {
	};

	record PostCountTitlesLikesStats(long postCount, String titles,
			IntSummaryStatistics likesStats) {
	};

	record TitlesBoundedSumOfLikes(String titles, int boundedSumOfLikes) {
	};

	public BlogPost(String title, String author, BlogPostType type, int likes) {
		this.title = title;
		this.author = author;
		this.type = type;
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public BlogPostType getType() {
		return type;
	}

	public int getLikes() {
		return likes;
	}

	@Override
	public String toString() {
		return "BlogPost{" + "title='" + title + '\'' + ", type=" + type + ", likes="
				+ likes + '}';
	}
}

class Tuple {
	private final BlogPostType type;
	private final String author;

	public Tuple(BlogPostType type, String author) {
		this.type = type;
		this.author = author;
	}

	public BlogPostType getType() {
		return type;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Tuple tuple = (Tuple) o;
		return type == tuple.type && author.equals(tuple.author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, author);
	}

	@Override
	public String toString() {
		return "Tuple{" + "type=" + type + ", author='" + author + '\'' + '}';
	}
}

public class Test4 {
	public static void main(String[] args) {

	}
}
