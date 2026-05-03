@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s.name, c.title FROM Student s JOIN s.courses c")
    List<Object[]> getStudentCourseData();
}
