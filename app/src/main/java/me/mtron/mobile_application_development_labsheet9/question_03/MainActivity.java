package me.mtron.mobile_application_development_labsheet9.question_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import me.mtron.mobile_application_development_labsheet9.R;

public class MainActivity extends AppCompatActivity {
    private ListView courseCodeListView;
    private TextView subjectNameTextView;
    private TextView lecturerNameTextView;
    private TextView creditsTextView;
    private ArrayList<Course> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        courseCodeListView = findViewById(R.id.courseCodeListView);
        subjectNameTextView = findViewById(R.id.subjectNameTextView);
        lecturerNameTextView = findViewById(R.id.lecturerNameTextView);
        creditsTextView = findViewById(R.id.creditsTextView);

        // Initialize courseList and populate it with your courses
        courseList = new ArrayList<>();
        courseList.add(new Course("CSC101", "Introduction to Computer Science", "Prof. Smith", 3));
        // Add more courses as needed

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getCourseCodes());
        courseCodeListView.setAdapter(adapter);

        courseCodeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Course clickedCourse = courseList.get(position);
                subjectNameTextView.setText(clickedCourse.getSubjectName());
                lecturerNameTextView.setText(clickedCourse.getLecturerName());
                creditsTextView.setText(String.valueOf(clickedCourse.getCredits()));
            }
        });
    }

    private ArrayList<String> getCourseCodes() {
        ArrayList<String> courseCodes = new ArrayList<>();
        for (Course course : courseList) {
            courseCodes.add(course.getCourseCode());
        }
        return courseCodes;
    }
}
