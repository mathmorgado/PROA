import style from "./header.module.css"
import LogoReact from "../../images/react.svg"

function Header() {
  
    return (
      <>
        <header>
          <div className={style.logo}>
            <img src={LogoReact} alt="Logo do React" />
            <span>React</span>
          </div>
          
          <nav>
            <ul>
              <li><a href="#">menu</a></li>
              <li><a href="#">sobre</a></li>
              <li><a href="#">produtos</a></li>
            </ul>
          </nav>

          <button>Logar</button>
        </header>
      </>
    )
  }
  
  export default Header