import { useState } from "react";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";
import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div>
      {isLoggedIn ? <UserPage /> : <GuestPage />}

      {isLoggedIn ? (
        <LogoutButton onClick={() => setIsLoggedIn(false)} />
      ) : (
        <LoginButton onClick={() => setIsLoggedIn(true)} />
      )}
    </div>
  );
}

export default App;