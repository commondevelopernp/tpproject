package model.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import java.util.HashSet;
import java.util.Set;

@Node("Movie")
public class MovieEntity {
@Id
private final String title;
@Property("tagline")
private final String description;
@Relationship(type = "ACTED_IN", direction = Direction.INCOMING)
private Set<PersonEntity> actors = new HashSet<>();
@Relationship(type = "DIRECTED", direction = Direction.INCOMING)
private Set<PersonEntity> directors = new HashSet<>();
public MovieEntity(String title, String description) {
this.title = title;
this.description = description;
}
public Set<PersonEntity> getActors() {
	return actors;
}
public void setActors(Set<PersonEntity> actors) {
	this.actors = actors;
}
public Set<PersonEntity> getDirectors() {
	return directors;
}
public void setDirectors(Set<PersonEntity> directors) {
	this.directors = directors;
}
public String getTitle() {
	return title;
}
public String getDescription() {
	return description;
}

}