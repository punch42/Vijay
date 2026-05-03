@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String instructor;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
