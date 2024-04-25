import styles from './header.module.css'
import { Link } from 'react-router-dom';
import Logo from '../images/logo.png'
import Lupa from '../images/lupa.png'

export default function Header() {
    return (
        <header className={styles.header}>
            <div className={styles.container_logo}>
                <img src={ Logo } alt="Logo" className={styles.logo} />
                <h1>Travel</h1>
            </div>

            <nav className={styles.navbar}>
                <ul className={styles.navbar_content}>
                    <Link className={styles.navbar_item} to="/" >Home</Link>
                    <Link className={styles.navbar_item} to="/Aruba" >Aruba</Link>
                    <Link className={styles.navbar_item} to="/Escocia" >Escócia</Link>
                    <Link className={styles.navbar_item} to="/GrandCanyon" >Grand Canyon</Link>
                    <Link className={styles.navbar_item} to="/China" >Muralhas da China</Link>
                </ul>
            </nav>

            <div className={styles.Conteiner_BarraDePesquisa}>
                <input type="text" className={styles.barra_pesquisa} />
                <img src={ Lupa } alt="Lupa de pesquisa" />
            </div>
        </header>
    );
}