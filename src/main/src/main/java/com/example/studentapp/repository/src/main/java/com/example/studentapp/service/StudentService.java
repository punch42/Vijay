@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void saveStudent(Student s) {
        repo.save(s);
    }
}
