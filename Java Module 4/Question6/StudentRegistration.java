import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends Frame implements ActionListener {

    TextField name, rollNo, age, course;
    Checkbox male, female, other;
    Checkbox reading, sports, music, coding, photography;
    Button submit;

    StudentRegistration() {

        setTitle("Student Registration");
        setSize(500, 450);
        setLayout(new BorderLayout(10, 10));

        // Main form
        Panel form = new Panel(new GridLayout(4, 2, 10, 10));

        form.add(new Label("Name:"));
        name = new TextField();
        form.add(name);

        form.add(new Label("Roll No:"));
        rollNo = new TextField();
        form.add(rollNo);

        form.add(new Label("Age:"));
        age = new TextField();
        form.add(age);

        form.add(new Label("Course:"));
        course = new TextField();
        form.add(course);

        add(form, BorderLayout.NORTH);

        // Gender
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT));

        genderPanel.add(new Label("Gender:"));

        CheckboxGroup genderGroup = new CheckboxGroup();

        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);
        other = new Checkbox("Other", genderGroup, false);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);

        // Hobbies
        Panel hobbyPanel = new Panel(new FlowLayout(FlowLayout.LEFT));

        hobbyPanel.add(new Label("Hobbies:"));

        reading = new Checkbox("Reading");
        sports = new Checkbox("Sports");
        music = new Checkbox("Music");
        coding = new Checkbox("Coding");
        photography = new Checkbox("Photography");

        hobbyPanel.add(reading);
        hobbyPanel.add(sports);
        hobbyPanel.add(music);
        hobbyPanel.add(coding);
        hobbyPanel.add(photography);

        // Middle section
        Panel options = new Panel(new GridLayout(2, 1));
        options.add(genderPanel);
        options.add(hobbyPanel);

        add(options, BorderLayout.CENTER);

        // Submit button
        Panel buttonPanel = new Panel(new FlowLayout());

        submit = new Button("Submit");
        submit.addActionListener(this);

        buttonPanel.add(submit);

        add(buttonPanel, BorderLayout.SOUTH);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setMinimumSize(new Dimension(450, 350));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String gender = "Not Selected";

        if (male.getState())
            gender = "Male";
        else if (female.getState())
            gender = "Female";
        else if (other.getState())
            gender = "Other";

        String hobbies = "";

        if (reading.getState())
            hobbies += "Reading, ";

        if (sports.getState())
            hobbies += "Sports, ";

        if (music.getState())
            hobbies += "Music, ";

        if (coding.getState())
            hobbies += "Coding, ";

        if (photography.getState())
            hobbies += "Photography";

        String data =
                "Name: " + name.getText() +
                "\nRoll No: " + rollNo.getText() +
                "\nAge: " + age.getText() +
                "\nCourse: " + course.getText() +
                "\nGender: " + gender +
                "\nHobbies: " + hobbies;

        System.out.println(data);

        new DialogBox(this, data);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}

class DialogBox extends Dialog {

    DialogBox(Frame parent, String data) {
        super(parent, "Student Details", true);

        setLayout(new BorderLayout());

        TextArea area = new TextArea(data, 8, 30);
        area.setEditable(false);

        add(area, BorderLayout.CENTER);

        setSize(350, 250);
        setResizable(false);
        setVisible(true);
    }
}