import style from './hero.module.css'
import paisagem from '../../images/foto-perfil.jpeg'

function Hero()
{
    const name = 'Matheus'
    return (
        <>
            <div className={style.hero}>
                <aside>
                    <h1> Olá, eu sou o <span>{name}</span> </h1>
                    <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Architecto, alias repellat ea quos dolor quisquam perspiciatis dolores quibusdam qui ex eveniet fugit quia molestiae autem voluptates, quas, non doloremque. Facilis. Lorem ipsum dolor sit amet consectetur adipisicing elit. Fuga sunt magni mollitia eum nobis pariatur?</p>
                    <button>saiba mais</button>
                </aside>
                <article>
                    <img src={paisagem} alt="Paisagem" />
                </article>
            </div>
        </>
    )
}

export default Hero