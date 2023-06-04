package com.example.lukedict;

import java.util.ArrayList;
import java.util.List;

public class ReadingUtils {
    private static final String[] readingtitle = {
            "Youth","Times","Diligent","Diamond","Gorgeous","Missing","Lover","Expect","Value","Affection"
    };

    private static final int[] resId = {
            R.mipmap.i1,R.mipmap.i2,R.mipmap.i3,R.mipmap.i4,R.mipmap.i5,R.mipmap.i6,
            R.mipmap.i7,R.mipmap.i8,R.mipmap.i9,R.mipmap.i10,
    };

    private static final String[] content = {
    "Youth\n" +
        "\n" +
        "  Youth is not a time of life; it is a state of mind; it is not a matter of rosy cheeks, red lips and supple knees; it is a matter of the will, a quality of the imagination, a vigor of the emotions; it is the freshness of the deep springs of life.\n" +
        "\n" +
        "Youth means a temperamental predominance of courage over timidity, of the appetite for adventure over the love of ease. This often exists in a man of 60 more than a boy of 20. Nobody grows old merely by a number of years. We grow old by deserting our ideals.\n" +
        "\n" +
        "Years may wrinkle the skin, but to give up enthusiasm wrinkles the soul. Worry, fear, self-distrust bows the heart and turns the spirit back to dust.\n" +
        "\n" +
        "Whether 60 or 16, there is in every human being’s heart the lure of wonders, the unfailing appetite for what’s next and the joy of the game of living. In the center of your heart and my heart, there is a wireless station; so long as it receives messages of beauty, hope, courage and power from man and from the infinite, so long as you are young.\n" +
        "\n" +
        "When your aerials are down, and your spirit is covered with snows of cynicism and the ice of pessimism, then you’ve grown old, even at 20; but as long as your aerials are up, to catch waves of optimism, there’s hope you may die young at 80.\n" +
        "\n" ,
            "Three Days to See(Excerpts)\n" +
                    "\n" +
                    "  All of us have read thrilling stories in which the hero had only a limited and specified time to live. Sometimes it was as long as a year, sometimes as short as 24 hours. But always we were interested in discovering just how the doomed hero chose to spend his last days or his last hours. I speak, of course, of free men who have a choice, not condemned criminals whose sphere of activities is strictly delimited.\n" +
                    "\n" +
                    "Such stories set us thinking, wondering what we should do under similar circumstances. What events, what experiences, what associations should we crowd into those last hours as mortal beings, what regrets?\n" +
                    "\n" +
                    "Sometimes I have thought it would be an excellent rule to live each day as if we should die tomorrow. Such an attitude would emphasize sharply the values of life. We should live each day with gentleness, vigor and a keenness of appreciation which are often lost when time stretches before us in the constant panorama of more days and months and years to come. There are those, of course, who would adopt the Epicurean motto of “Eat, drink, and be merry”. But most people would be chastened by the certainty of impending death.\n" +
                    "\n" +
                    "In stories the doomed hero is usually saved at the last minute by some stroke of fortune, but almost always his sense of values is changed. He becomes more appreciative of the meaning of life and its permanent spiritual values. It has often been noted that those who live, or have lived, in the shadow of death bring a mellow sweetness to everything they do.\n" +
                    "\n" +
                    "Most of us, however, take life for granted. We know that one day we must die, but usually we picture that day as far in the future. When we are in buoyant health, death is all but unimaginable. We seldom think of it. The days stretch out in an endless vista. So we go about our petty tasks, hardly aware of our listless attitude toward life.\n" +
                    "\n" +
                    "The same lethargy, I am afraid, characterizes the use of all our faculties and senses. Only the deaf appreciate hearing, only the blind realize the manifold blessings that lie in sight. Particularly does this observation apply to those who have lost sight and hearing in adult life. But those who have never suffered impairment of sight or hearing seldom make the fullest use of these blessed faculties. Their eyes and ears take in all sights and sounds hazily, without concentration and with little appreciation. It is the same old story of not being grateful for what we have until we lose it, of not being conscious of health until we are ill.\n" +
                    "\n" +
                    "I have often thought it would be a blessing if each human being were stricken blind and deaf for a few days at some time during his early adult life. Darkness would make him more appreciative of sight; silence would teach him the joys of sound.",
       "Companionship of Books\n" +
               "\n" +
               "  A man may usually be known by the books he reads as well as by the company he keeps; for there is a companionship of books as well as of men; and one should always live in the best company, whether it be of books or of men.\n" +
               "\n" +
               "A good book may be among the best of friends. It is the same today that it always was, and it will never change. It is the most patient and cheerful of companions. It does not turn its back upon us in times of adversity or distress. It always receives us with the same kindness; amusing and instructing us in youth, and comforting and consoling us in age.\n" +
               "\n" +
               "Men often discover their affinity to each other by the mutual love they have for a book just as two persons sometimes discover a friend by the admiration which both entertain for a third. There is an old proverb, ‘Love me, love my dog.” But there is more wisdom in this:” Love me, love my book.” The book is a truer and higher bond of union. Men can think, feel, and sympathize with each other through their favorite author. They live in him together, and he in them.\n" +
               "\n" +
               "A good book is often the best urn of a life enshrining the best that life could think out; for the world of a man’s life is, for the most part, but the world of his thoughts. Thus the best books are treasuries of good words, the golden thoughts, which, remembered and cherished, become our constant companions and comforters.\n" +
               "\n" +
               "Books possess an essence of immortality. They are by far the most lasting products of human effort. Temples and statues decay, but books survive. Time is of no account with great thoughts, which are as fresh today as when they first passed through their author’s minds, ages ago. What was then said and thought still speaks to us as vividly as ever from the printed page. The only effect of time have been to sift out the bad products; for nothing in literature can long survive e but what is really good.\n" +
               "\n" +
               "Books introduce us into the best society; they bring us into the presence of the greatest minds that have ever lived. We hear what they said and did; we see the as if they were really alive; we sympathize with them, enjoy with them, grieve with them; their experience becomes ours, and we feel as if we were in a measure actors with them in the scenes which they describe.\n" +
               "\n" +
               "The great and good do not die, even in this world. Embalmed in books, their spirits walk abroad. The book is a living voice. It is an intellect to which on still listens.",
            "If I Rest, I Rust\n" +
                    "\n" +
                    "  The significant inscription found on an old key---“If I rest, I rust”---would be an excellent motto for those who are afflicted with the slightest bit of idleness. Even the most industrious person might adopt it with advantage to serve as a reminder that, if one allows his faculties to rest, like the iron in the unused key, they will soon show signs of rust and, ultimately, cannot do the work required of them.\n" +
                    "\n" +
                    "Those who would attain the heights reached and kept by great men must keep their faculties polished by constant use, so that they may unlock the doors of knowledge, the gate that guard the entrances to the professions, to science, art, literature, agriculture---every department of human endeavor.\n" +
                    "\n" +
                    "Industry keeps bright the key that opens the treasury of achievement. If Hugh Miller, after toiling all day in a quarry, had devoted his evenings to rest and recreation, he would never have become a famous geologist. The celebrated mathematician, Edmund Stone, would never have published a mathematical dictionary, never have found the key to science of mathematics, if he had given his spare moments to idleness, had the little Scotch lad, Ferguson, allowed the busy brain to go to sleep while he tended sheep on the hillside instead of calculating the position of the stars by a string of beads, he would never have become a famous astronomer.\n" +
                    "\n" +
                    "Labor vanquishes all---not inconstant, spasmodic, or ill-directed labor; but faithful, unremitting, daily effort toward a well-directed purpose. Just as truly as eternal vigilance is the price of liberty, so is eternal industry the price of noble and enduring success.",
            "Ambition\n" +
                    "\n" +
                    "  It is not difficult to imagine a world short of ambition. It would probably be a kinder world: with out demands, without abrasions, without disappointments. People would have time for reflection. Such work as they did would not be for themselves but for the collectivity. Competition would never enter in. conflict would be eliminated, tension become a thing of the past. The stress of creation would be at an end. Art would no longer be troubling, but purely celebratory in its functions. Longevity would be increased, for fewer people would die of heart attack or stroke caused by tumultuous endeavor. Anxiety would be extinct. Time would stretch on and on, with ambition long departed from the human heart.\n" +
                    "\n" +
                    "Ah, how unrelieved boring life would be!\n" +
                    "\n" +
                    "There is a strong view that holds that success is a myth, and ambition therefore a sham. Does this mean that success does not really exist? That achievement is at bottom empty? That the efforts of men and women are of no significance alongside the force of movements and events now not all success, obviously, is worth esteeming, nor all ambition worth cultivating. Which are and which are not is something one soon enough learns on one’s own. But even the most cynical secretly admit that success exists; that achievement counts for a great deal; and that the true myth is that the actions of men and women are useless. To believe otherwise is to take on a point of view that is likely to be deranging. It is, in its implications, to remove all motives for competence, interest in attainment, and regard for posterity.\n" +
                    "\n" +
                    "We do not choose to be born. We do not choose our parents. We do not choose our historical epoch, the country of our birth, or the immediate circumstances of our upbringing. We do not, most of us, choose to die; nor do we choose the time or conditions of our death. But within all this realm of choicelessness, we do choose how we shall live: courageously or in cowardice, honorably or dishonorably, with purpose or in drift. We decide what is important and what is trivial in life. We decide that what makes us significant is either what we do or what we refuse to do. But no matter how indifferent the universe may be to our choices and decisions, these choices and decisions are ours to make. We decide. We choose. And as we decide and choose, so are our lives formed. In the end, forming our own destiny is what ambition is about.",
            "What I Have Lived For\n" +
                    "\n" +
                    "  Three passions, simple but overwhelmingly strong, have governed my life: the longing for love, the search for knowledge, and unbearable pity for the suffering of mankind. These passions, like great winds, have blown me hither and thither, in a wayward course, over a deep ocean of anguish, reaching to the very verge of despair.\n" +
                    "\n" +
                    "I have sought love, first, because it brings ecstasy---ecstasy so great that I would often have sacrificed all the rest of my life for a few hours for this joy. I have sought it, next, because it relieves loneliness---that terrible loneliness in which one shivering consciousness looks over the rim of the world into the cold unfathomable lifeless abyss. I have sought it, finally, because in the union of love I have seen, in a mystic miniature, the prefiguring vision of the heaven that saints and poets have imagined. This is what I sought, and though it might seem too good for human life, this is what---at last---I have found.\n" +
                    "\n" +
                    "With equal passion I have sought knowledge. I have wished to understand the hearts of men. I have wished to know why the stars shine. And I have tried to apprehend the Pythagorean power by which number holds sway above the flux. A little of this, but not much, I have achieved.\n" +
                    "\n" +
                    "Love and knowledge, so far as they were possible, led upward toward the heavens. But always it brought me back to earth. Echoes of cries of pain reverberate in my heart. Children in famine, victims tortured by oppressors, helpless old people a hated burden to their sons, and the whole world of loneliness, poverty, and pain make a mockery of what human life should be. I long to alleviate the evil, but I cannot, and I too suffer.\n" +
                    "\n" +
                    "  This has been my life. I have found it worth living, and would gladly live it again if the chance were offered me.",
            "　  To accurately say that your family and friends don't care about you would be a very rare situation. Maybe you're being too negative and overlooking the gestures of love they show you. They don't even have to be big gestures, but it's the little things they do for you that count. And people may be reacting to the energy you're putting out; perhaps you think they don't care about you so you don't make any effort in your relationships. Start showing people you care, so they can show you back in kind. And if you don't have good relationships with the people you know, what's stopping you from making new friends?",
            "　If you dislike a person in your work or personal life, focusing on her bad qualities is not going to make things better. You need to let go of your assumptions about her and know that she is human too, which means she makes mistakes. Either you move on and stop thinking and talking about her, or learn to approach her or think about her in a positive manner. Focus on her good qualities, and repeat them to yourself instead of honing in on the unpleasant things.",
            "　Comparing yourself to someone else is never productive or positive. There's always going to be someone who is younger, prettier, smarter, or richer than you. If you keep coveting what someone else has, then this may cause you to be resentful of them, which will open a whole other negative can of worms. Remember, what they don't have is your whole package. Be appreciative of what you have, because if you want to play the comparison game, remember that there are people who are also worse off than you are.",
            "  If you think you're not going to be able \"get there,\" think again. There are many people who are worse off and have overcome bigger obstacles than what you are facing. Take, for example, Olympic sprinter Oscar Pistorius, an amputee who overcame his handicap to compete in the Olympics against his able-bodied peers. Everything is within your reach as long as you work hard and have a a positive attitude.",
            "  My parents, of course, I have to tell you, didn’t understand my dreams at all. They were always wondering. They said, “What is he doing? When are you going to get a job, a real job? When are you going to make money?” And all of those questions I got. And they said, “I hope we didn’t raise a bum, someone that doesn’t make money and just wants to live in a gymnasium and think about their bodies.” Well, I endured all of this negative thinking, and the more negative the thinking got, and the more negative the questions got, the stronger and the more positive I became, the stronger I became inside."
    };

    public static List<ReadingBean> getAllReadingList(){
    List<ReadingBean> list = new ArrayList<>();
        for(int i = 0; i < readingtitle.length; i++){
            ReadingBean bean = new ReadingBean(readingtitle[i],content[i],resId[i]);
            list.add(bean);
        }
    return list;
    }
}
