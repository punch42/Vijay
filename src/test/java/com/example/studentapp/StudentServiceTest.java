@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService service;

    @Test
    void testSave() {
        Student s = new Student();
        s.setName("Test");
        service.saveStudent(s);
        assertNotNull(s.getId());
    }
}
