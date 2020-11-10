package TaskBoard.main.repository;

import TaskBoard.main.model.ProjectTask;
import org.springframework.data.repository.CrudRepository;

public interface ProjectTaskRepository extends CrudRepository<ProjectTask,Long> {
}
