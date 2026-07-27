import "./App.css";
import BookDetails from "./BookDetails/BookDetails";
import BlogDetails from "./BlogDetails/BlogDetails";
import CourseDetails from "./CourseDetails/CourseDetails";

function App() {
  return (
    <div>
      <div className="st2">
        <CourseDetails />
      </div>

      <div className="v1">
        <BookDetails />
      </div>

      <div className="mystyle1">
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;