function CourseDetails() {
    const courses = [
      {
        id: 1,
        cname: "Angular",
        date: "4/5/2021"
      },
      {
        id: 2,
        cname: "React",
        date: "6/3/20201"
      }
    ];
  
    const coursedet = (
      <ul>
        {courses.map((course) => (
          <div key={course.id}>
            <h2>{course.cname}</h2>
            <h4>{course.date}</h4>
          </div>
        ))}
      </ul>
    );
  
    return (
        <div>
        <h1>Course Details</h1>
        {coursedet}
      </div>
    );
  }
  
  export default CourseDetails;