import PropTypes from 'prop-types';
import Mala from '../images/mala-home.png'

export default function Section(props) {
    return (
        <section className={props.classSection}>
            <div className="conteudo">
                <h1>{props.titulo}</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque pariatur vero doloremque ipsam possimus quidem dolor distinctio veniam natus at ex impedit ducimus minima eaque temporibus, excepturi laboriosam soluta qui. Lorem ipsum, dolor sit amet consectetur adipisicing elit. Deserunt dolorum amet rerum. Doloremque facilis eligendi pariatur odio vero sint culpa est corporis.</p>
            </div>
            <article className={props.imagem}>
                <img src={Mala} alt="Mala ilustrativa para viagem" />
            </article>
        </section>
    );
}

Section.propTypes = {
    classSection: PropTypes.string.isRequired,
    titulo: PropTypes.string.isRequired,
    imagem: PropTypes.string.isRequired,
};