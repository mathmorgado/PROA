import './App.css';
import Header from './assets/components/Header';
import Footer from './assets/components/Footer';

/*2- Layout pré-definido (reaproveitamento de estrutura)*/
import { Outlet } from 'react-router-dom';

function App() {
  return (
    <main>
      <Header />
      <Outlet />
      <Footer />
    </main>
  );
}

export default App;
