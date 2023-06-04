package com.example.lukedict;
import java.util.ArrayList;
import java.util.List;

public class SearchUtils {
private static final String[] word = {
        "abandon","accordance","advent","aerial","annex","benevolent","bouquet","brag",
        "breach","casino","comet","condolence","congregate","converge","diesel","diffuse",
        "dissent","dividend","dread","enlist","erect","esteem","etiquette","evade",
        "facet","fling","fringe","frown","fury","greed"
};

private static final String[] trans = {
        "抛弃","按照","到来","空中的","强占","仁慈的","花束",
        "吹牛","违反","赌场","彗星","哀悼","聚集","靠拢",
        "柴油","弥漫的","异议","红利","恐惧","支持","竖立的",
         "尊重","礼节","逃避","方面","投掷","边缘","皱眉","暴怒","贪婪"
};

    private static final String[] summary = {
            "v. 抛弃，遗弃；（因危险）离开，舍弃；中止，不再有；放弃（信念、信仰或看法）；陷入，沉湎于（某种情感）\n" +
                    "n. 放任，放纵\n" +
                    "高中 | CET4 | CET6 | 考研 | IELTS | TOEFL | GRE | SAT | 商务英语",
            "n. 按照，依据，与……一致（in accordance with）\n" +
                    "CET4 | CET6 | 考研\n","n. 出现，到来，问世；基督降临节（Advent）；基督降临，基督复临（Advent）\n" +
            "CET6 | 考研 | IELTS | TOEFL | GRE | GMAT | SAT","n. 天线；（滑雪等运动的）空中腾越\n" +
            "adj. 航空的，从飞机上的；空中的，地表以上的；由飞机实施的；（植物的某部分）气生的；在空中翱翔的；（在）大气（中）的\n" +
            "复数 aerials\n" +
            "CET4 | CET6 | 考研 | TOEFL | GRE | SAT","v. 强占，并吞，兼并；附加（尤指对文件补充）\n" +
            "n. 附属建筑；（文件的）附录，附件\n" +
            "【名】 （Annex）（美、法、加、瑞、尼）艾尼克斯（人名）\n" +
            "复数 annexes第三人称单数 annexes现在分词 annexing过去式 annexed过去分词 annexed\n" +
            "CET6 | TOEFL | GRE | SAT | 商务英语","adj. 仁慈的，乐善好施的；（用于慈善机构名称）慈善的，救济的\n" +
            "CET6 | IELTS | TOEFL | GRE | SAT",
            "n. 花束；（尤指酒的）香味，芬芳；赞扬，恭维\n" +
                    "【名】 （Bouquet）（英、法）布凯（人名)\n" +
                    "复数 bouquets\n" +
                    "CET6 | TOEFL | GRE","v. 吹牛，自夸\n" +
            "n. 大话，夸耀之词；勃莱格牌戏（简化的扑克牌戏）\n" +
            "adj. <美，非正式>卓越的，一流的\n" +
            "【名】 （Brag）（美、乌、瑞、丹、德）布拉格（人名）\n" +
            "复数 brags第三人称单数 brags现在分词 bragging过去式 bragged过去分词 bragged比较级 bragger最高级 braggest\n" +
            "CET4 | CET6 | TOEFL | GRE | SAT","n. 违反，破坏；（关系）中断，终止；缺口\n" +
            "v. 违反，破坏；在……上打开缺口\n" +
            "复数 breaches第三人称单数 breaches现在分词 breaching过去式 breached过去分词 breached\n" +
            "CET6 | 考研 | TOEFL | GRE | SAT","n. 赌场\n" +
            "【名】 （Casino）（西、法）卡西诺（人名）\n" +
            "复数 casinos\n" +
            "CET6","n. 彗星\n" +
            "【名】 （Comet）（法）科梅（人名）\n" +
            "复数 comets\n" +
            "CET6 | 考研 | IELTS | TOEFL | GRE | GMAT","n. 吊唁，哀悼\n" +
            "复数 condolences\n" +
            "CET6",
            "v. 集合，聚集\n" +
                    "adj. 集合在一起的\n" +
                    "第三人称单数 congregates现在分词 congregating过去式 congregated过去分词 congregated","v. （使）汇聚，集中；（观点、目标）趋同；（数）收敛\n" +
            "第三人称单数 converges现在分词 converging过去式 converged过去分词 converged\n" +
            "CET6 | 考研 | TOEFL | GRE | 商务英语","n. 柴油；内燃机，柴油车\n" +
            "【名】 (Diesel）（德）狄塞耳（人名）\n" +
            "复数 diesels第三人称单数 diesels现在分词 dieseling过去式 dieseled过去分词 dieseled\n" +
            "CET6 | IELTS | GRE | GMAT","v. 扩散，弥漫；减弱，平息（不良情绪或局面）；传播，散布\n" +
            "adj. 扩散的，弥漫的；难解的，冗长的\n" +
            "第三人称单数 diffuses现在分词 diffusing过去式 diffused过去分词 diffused比较级 more diffuse最高级 most diffuse\n" +
            "CET6 | 考研 | IELTS | TOEFL | GRE","v. 持异议，不同意；对国教（或东正教教义）不遵循\n" +
            "n. 不同意，意见的分歧；（在诉讼案中某法官对其他法官所做判决提出的）异议；不服从裁判；对国教（或东正教教义）不遵循\n" +
            "复数 dissents第三人称单数 dissents现在分词 dissenting过去式 dissented过去分词 dissented\n" +
            "CET6 | TOEFL | GRE | GMAT | SAT","n. 红利，股息；好处，回报；（足球彩票的）彩金；被除数\n" +
            "复数 dividends\n" +
            "CET6 | 考研 | IELTS | TOEFL | GRE | GMAT | SAT | 商务英语",
            "v. 畏惧，担心；<古>敬畏\n" +
                    "n. 害怕，畏惧；令人生畏的人，可怕的事物；（鸥鸟等鸟群的）惊飞，惊起；将头发编成“骇人”发型的人\n" +
                    "adj. 令人生畏的，可怕的；恼火的，生气的\n" +
                    "复数 dreads第三人称单数 dreads现在分词 dreading过去式 dreaded过去分词 dreaded\n" +
                    "CET6 | 考研 | GRE","v. （使）参军，（使）入伍；争取，谋取；赞助，支持\n" +
            "第三人称单数 enlists现在分词 enlisting过去式 enlisted过去分词 enlisted\n" +
            "CET6 | IELTS | TOEFL | GRE | GMAT | SAT","v. 搭建，建造；使竖立，竖起；创立，建立；安装，装配；（使）勃起\n" +
            "adj. 竖直的，直立的；竖起的；勃起的，坚挺的\n" +
            "第三人称单数 erects现在分词 erecting过去式 erected过去分词 erected比较级 more erect最高级 most erect\n" +
            "CET6 | 考研 | TOEFL | GRE","n. 尊重，敬重\n" +
            "v. 尊重，敬重；认为，把……看作\n" +
            "第三人称单数 esteems现在分词 esteeming过去式 esteemed过去分词 esteemed\n" +
            "CET6 | 考研 | IELTS | TOEFL | GRE | GMAT | SAT","n. 礼节，规矩\n" +
            "初中 | 高中 | CET6 | TOEFL | GRE\n","v. 规避，逃避；难倒，使困惑；未能（被某人）获得；（尤指违法犯罪后）逃脱，躲开（追捕）\n" +
            "第三人称单数 evades现在分词 evading过去式 evaded过去分词 evaded\n" +
            "CET6 | 考研 | TOEFL | GRE | GMAT | SAT",
            "n. 部分，方面；（宝石的）琢面，刻面；（构成昆虫或甲壳动物复眼的）小眼面\n" +
                    "v. 在……上琢面\n" +
                    "复数 facets第三人称单数 facets现在分词 facetting或faceting过去式 facetted或faceted过去分词 facetted或faceted\n" +
                    "CET6 | TOEFL | GRE | SAT\n","v. 扔，掷；猛动（身体部位）；粗暴地（向某人）说\n" +
            "n. 短暂的风流韵事；一阵尽情的欢乐\n" +
            "复数 flings第三人称单数 flings现在分词 flinging过去式 flung过去分词 flung\n" +
            "CET6 | 考研","n. 穗，流苏；<英>刘海儿；（地区、组织或活动范围的）边缘，外围；偏激的人，极端的活动；干扰条纹，散乱边纹；（动物的）缘缨，（植物的）毛缘；（工资外的）补贴，附加福利\n" +
            "v. 在……上装以缘饰，加穗于；形成……的边缘\n" +
            "adj. 次要的，非主流的\n" +
            "复数 fringes第三人称单数 fringes现在分词 fringing过去式 fringed过去分词 fringed\n" +
            "CET6 | 考研 | IELTS | GRE\n","v. 皱眉，蹙额；皱眉对……表示不满；不同意，不许可（frown on/upon）\n" +
            "n. 皱眉，蹙额\n" +
            "复数 frowns第三人称单数 frowns现在分词 frowning过去式 frowned过去分词 frowned\n" +
            "CET6 | 考研 | IELTS\n","n. 暴怒，狂怒；（暴风雨或洪水的）猛烈，剧烈；复仇三女神 (The Furies)；激怒者；复仇三女神 （The Furies）\n" +
            "复数 furies\n" +
            "CET6 | IELTS | GRE","n. 贪婪，贪欲；贪食，贪吃\n" +
            "CET6 | GRE"
    };

    public static List<WordBean> getAllWordLists(){
        List<WordBean>list = new ArrayList<>();   //创建这个集合
            for (int i = 0; i < word.length; i++) {
                WordBean bean = new WordBean(word[i],trans[i],summary[i]);
                list.add(bean);    //将数据添加到集合当中
            }
        return list;
    }
}
