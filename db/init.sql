CREATE TABLE courses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    course_code VARCHAR(10) NOT NULL,
    course_number SMALLINT NOT NULL,
    credit_units SMALLINT NOT NULL,
    college VARCHAR(255) NOT NULL,
    department VARCHAR(255) NOT NULL
);

CREATE TABLE prerequisites (
    id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT NOT NULL,
    prerequisite_course_id INT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES courses(id),
    FOREIGN KEY (prerequisite_course_id) REFERENCES courses(id)
);

