import styles from './section.module.css'
import Mala from '../images/mala-home.png'

export default function Section() {
    return (
        <section className={styles.section_home}>
            <div className={styles.conteudo_home}>
                <h1>Preparado para viagens incríveis?</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque pariatur vero doloremque ipsam possimus quidem dolor distinctio veniam natus at ex impedit ducimus minima eaque temporibus, excepturi laboriosam soluta qui. Lorem ipsum, dolor sit amet consectetur adipisicing elit. Deserunt dolorum amet rerum. Doloremque facilis eligendi pariatur odio vero sint culpa est corporis.</p>
            </div>
            <article>
                <img src={Mala} alt="Mala ilustrativa para viagem" />
            </article>
        </section>
    );
}