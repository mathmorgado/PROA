import styles from './footer.module.css'
import Instagram from '../images/instagram.webp'
import Facebook from '../images/facebook.webp'
import Tiktok from '../images/tiktok.png'
import Whatsapp from '../images/whatsapp.png'

export default function Footer() {
    return (
        <footer>
            <div className={styles.conteudo_footer}>
                <p>Siga-nos em nossas redes sociais</p>
                <div className={styles.container_RedeSocial}>
                    <img src={ Instagram } alt="Instagram" />
                    <img src={ Facebook } alt="Facebook" />
                    <img src={ Tiktok } alt="TikTok" />
                    <img src={ Whatsapp } alt="WhatsApp" />
                </div>
                <p>Telefone de contato: (11) 955- 3355</p>
            </div>
        </footer>
    );
}