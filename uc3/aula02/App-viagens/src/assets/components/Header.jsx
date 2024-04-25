import styles from './header.module.css'
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
                    <li className={styles.navbar_item}>Home</li>
                    <li className={styles.navbar_item}>Escócia</li>
                    <li className={styles.navbar_item}>Muralhas da China</li>
                    <li className={styles.navbar_item}>Grand Canyon</li>
                    <li className={styles.navbar_item}>Aruba</li>
                </ul>
            </nav>

            <div className={styles.Conteiner_BarraDePesquisa}>
                <input type="text" className={styles.barra_pesquisa} />
                <img src={ Lupa } alt="Lupa de pesquisa" />
            </div>
        </header>
    );
}