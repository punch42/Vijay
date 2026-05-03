@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students/list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("student", new Student());
        return "students/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student s) {
        service.saveStudent(s);
        return "redirect:/";
    }
}
