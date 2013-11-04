package models;

import java.util.*;
import java.util.List;
import com.avaje.ebean.Ebean;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.Ebean;

import play.data.format.Formats.NonEmpty;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


@Entity
public class Task extends Model {

  @Id
  public Long id;
  
  @Required
  public String label;
  
  public static Finder<Long,Task> find = new Finder(
    Long.class, Task.class
  );
  
  public static List<Task> all() {
  return find.all();
}

public static void create(Task task) {
  task.save();
}
  

    
}
