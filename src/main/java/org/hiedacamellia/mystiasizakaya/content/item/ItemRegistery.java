package org.hiedacamellia.mystiasizakaya.content.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.hiedacamellia.mystiasizakaya.MystiasIzakaya;
import org.hiedacamellia.mystiasizakaya.content.block.ModBlocks;
import org.hiedacamellia.mystiasizakaya.content.item.beverages.*;
import org.hiedacamellia.mystiasizakaya.content.item.cuisines.*;
import org.hiedacamellia.mystiasizakaya.content.item.currency.En10Item;
import org.hiedacamellia.mystiasizakaya.content.item.currency.En10kItem;
import org.hiedacamellia.mystiasizakaya.content.item.currency.En1Item;
import org.hiedacamellia.mystiasizakaya.content.item.currency.En5Item;
import org.hiedacamellia.mystiasizakaya.content.item.ingredients.*;
import org.hiedacamellia.mystiasizakaya.content.item.kitchenwares.*;
import org.hiedacamellia.mystiasizakaya.content.item.utils.IconItem;
import org.hiedacamellia.mystiasizakaya.content.item.utils.IronKnifeItem;
import org.hiedacamellia.mystiasizakaya.content.item.utils.LingXianItem;

public class ItemRegistery {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MystiasIzakaya.MODID);

	public static final RegistryObject<Item> COOKING_RANGE = block(ModBlocks.COOKING_RANGE);
	public static final RegistryObject<Item> BANK = block(ModBlocks.BANK);
	//kictenwires
	public static final RegistryObject<Item> LIAO_LI_TAI = REGISTRY.register("liao_li_tai", LiaoLiTaiItem::new);
	public static final RegistryObject<Item> SHAO_KAO_JIA = REGISTRY.register("shao_kao_jia", ShaoKaoJiaItem::new);
	public static final RegistryObject<Item> YOU_GUO = REGISTRY.register("you_guo", YouGuoItem::new);
	public static final RegistryObject<Item> ZHENG_GUO = REGISTRY.register("zheng_guo", ZhengGuoItem::new);
	public static final RegistryObject<Item> ZHU_GUO = REGISTRY.register("zhu_guo", ZhuGuoItem::new);
	//ingredients
	public static final RegistryObject<Item> BA_MU_MAN = REGISTRY.register("ba_mu_man", BaMuManItem::new);
	public static final RegistryObject<Item> BAI_GUO = REGISTRY.register("bai_guo", BaiGuoItem::new);
	public static final RegistryObject<Item> BAN_LI = REGISTRY.register("ban_li", BanLiItem::new);
	public static final RegistryObject<Item> BING_DI_LIAN = REGISTRY.register("bing_di_lian", BingDiLianItem::new);
	public static final RegistryObject<Item> BING_KUAI = REGISTRY.register("bing_kuai", BingKuaiItem::new);
	public static final RegistryObject<Item> CHAN_SHUI = REGISTRY.register("chan_shui", ChanShuiItem::new);
	public static final RegistryObject<Item> CHUN_CHUN = REGISTRY.register("chun_chun", ChunChunItem::new);
	public static final RegistryObject<Item> DI_GUA = REGISTRY.register("di_gua", DiGuaItem::new);
	public static final RegistryObject<Item> DOU_FU = REGISTRY.register("dou_fu", DouFuItem::new);
	public static final RegistryObject<Item> FENG_MI = REGISTRY.register("feng_mi", FengMiItem::new);
	public static final RegistryObject<Item> HAI_DAN = REGISTRY.register("hai_dan", HaiDanItem::new);
	public static final RegistryObject<Item> HAI_TAI = REGISTRY.register("hai_tai", HaiTaiItem::new);
	public static final RegistryObject<Item> HEI_MAO_ZHU_ROU = REGISTRY.register("hei_mao_zhu_rou", HeiMaoZhuRouItem::new);
	public static final RegistryObject<Item> HEI_YAN = REGISTRY.register("hei_yan", HeiYanItem::new);
	public static final RegistryObject<Item> HE_NIU = REGISTRY.register("he_niu", HeNiuItem::new);
	public static final RegistryObject<Item> HE_TUN = REGISTRY.register("he_tun", HeTunItem::new);
	public static final RegistryObject<Item> HONG_DOU = REGISTRY.register("hong_dou", HongDouItem::new);
	public static final RegistryObject<Item> HUANG_GUA = REGISTRY.register("huang_gua", HuangGuaItem::new);
	public static final RegistryObject<Item> HUANG_YOU = REGISTRY.register("huang_you", HuangYouItem::new);
	public static final RegistryObject<Item> HUAN_TAN_HUA = REGISTRY.register("huan_tan_hua", HuanTanHuaItem::new);
	public static final RegistryObject<Item> JIN_QIANG_YU = REGISTRY.register("jin_qiang_yu", JinQiangYuItem::new);
	public static final RegistryObject<Item> JI_DAN = REGISTRY.register("ji_dan", JiDanItem::new);
	public static final RegistryObject<Item> JI_SHANG_JIN_QIANG_YU = REGISTRY.register("ji_shang_jin_qiang_yu", JiShangJinQiangYuItem::new);
	public static final RegistryObject<Item> KE_KE_DOU = REGISTRY.register("ke_ke_dou", KeKeDouItem::new);
	public static final RegistryObject<Item> LA_JIAO = REGISTRY.register("la_jiao", LaJiaoItem::new);
	public static final RegistryObject<Item> LIAN_ZI = REGISTRY.register("lian_zi", LianZiItem::new);
	public static final RegistryObject<Item> LUO_BU = REGISTRY.register("luo_bu", LuoBuItem::new);
	public static final RegistryObject<Item> LU_ROU = REGISTRY.register("lu_rou", LuRouItem::new);
	public static final RegistryObject<Item> LU_SHUI = REGISTRY.register("lu_shui", LuShuiItem::new);
	public static final RegistryObject<Item> MEI_ZI = REGISTRY.register("mei_zi", MeiZiItem::new);
	public static final RegistryObject<Item> MIAN_FEN = REGISTRY.register("mian_fen", MianFenItem::new);
	public static final RegistryObject<Item> MO_GU = REGISTRY.register("mo_gu", MoGuItem::new);
	public static final RegistryObject<Item> NAI_YOU = REGISTRY.register("nai_you", NaiYouItem::new);
	public static final RegistryObject<Item> NAN_GUA = REGISTRY.register("nan_gua", NanGuaItem::new);
	public static final RegistryObject<Item> NING_MENG = REGISTRY.register("ning_meng", NingMengItem::new);
	public static final RegistryObject<Item> NIU_ROU = REGISTRY.register("niu_rou", NiuRouItem::new);
	public static final RegistryObject<Item> NUO_MI = REGISTRY.register("nuo_mi", NuoMiItem::new);
	public static final RegistryObject<Item> PANG_XIE = REGISTRY.register("pang_xie", PangXieItem::new);
	public static final RegistryObject<Item> PU_PU_YOU_GUO = REGISTRY.register("pu_pu_you_guo", PuPuYouGuoItem::new);
	public static final RegistryObject<Item> PU_TAO = REGISTRY.register("pu_tao", PuTaoItem::new);
	public static final RegistryObject<Item> QIANG_XIAO_LA_JIAO_SU = REGISTRY.register("qiang_xiao_la_jiao_su", QiangXiaoLaJiaoSu::new);
	public static final RegistryObject<Item> SAN_WEN_YU = REGISTRY.register("san_wen_yu", SanWenYuItem::new);
	public static final RegistryObject<Item> SONG_LU = REGISTRY.register("song_lu", SongLuItem::new);
	public static final RegistryObject<Item> SONG_ZI = REGISTRY.register("song_zi", SongZiItem::new);
	public static final RegistryObject<Item> TAO_ZI = REGISTRY.register("tao_zi", TaoZiItem::new);
	public static final RegistryObject<Item> TU_DOU = REGISTRY.register("tu_dou", TuDouItem::new);
	public static final RegistryObject<Item> XIA = REGISTRY.register("xia", XiaItem::new);
	public static final RegistryObject<Item> XIAN_HUA = REGISTRY.register("xian_hua", XianHuaItem::new);
	public static final RegistryObject<Item> XI_HONG_SHI = REGISTRY.register("xi_hong_shi", XiHongShiItem::new);
	public static final RegistryObject<Item> XI_LAN_HUA = REGISTRY.register("xi_lan_hua", XiLanHuaItem::new);
	public static final RegistryObject<Item> XU_LI = REGISTRY.register("xu_li", XuLiItem::new);
	public static final RegistryObject<Item> YANG_CONG = REGISTRY.register("yang_cong", YangCongItem::new);
	public static final RegistryObject<Item> YE_ZHU_ROU = REGISTRY.register("ye_zhu_rou", YeZhuRouItem::new);
	public static final RegistryObject<Item> YIN_ER = REGISTRY.register("yin_er", YinErItem::new);
	public static final RegistryObject<Item> YUE_GUANG_CAO = REGISTRY.register("yue_guang_cao", YueGuangCaoItem::new);
	public static final RegistryObject<Item> ZHANG_YU = REGISTRY.register("zhang_yu", ZhangYuItem::new);
	public static final RegistryObject<Item> ZHI_SHI = REGISTRY.register("zhi_shi", ZhiShiItem::new);
	public static final RegistryObject<Item> ZHU_ROU = REGISTRY.register("zhu_rou", ZhuRouItem::new);
	public static final RegistryObject<Item> ZHU_SUN = REGISTRY.register("zhu_sun", ZhuSunItem::new);
	public static final RegistryObject<Item> ZHU_ZI = REGISTRY.register("zhu_zi", ZhuZiItem::new);
	public static final RegistryObject<Item> ZUN_YU = REGISTRY.register("zun_yu", ZunYuItem::new);
	//cuisines
	public static final RegistryObject<Item> BAI_GUO_LUO_BU_PAI_GU_TANG = REGISTRY.register("bai_guo_luo_bu_pai_gu_tang", BaiGuoLuoBuPaiGuTangItem::new);
	public static final RegistryObject<Item> BAI_LU_ZHEN_SONG = REGISTRY.register("bai_lu_zhen_song", BaiLuZhenSongItem::new);
	public static final RegistryObject<Item> BAI_TAO_SHENG_BA_QIAO = REGISTRY.register("bai_tao_sheng_ba_qiao", BaiTaoShengBaQiaoItem::new);
	public static final RegistryObject<Item> BAI_XUE = REGISTRY.register("bai_xue", BaiXueItem::new);
	public static final RegistryObject<Item> BAN_NI_DI_KE_DAN = REGISTRY.register("ban_ni_di_ke_dan", BanNiDiKeDanItem::new);
	public static final RegistryObject<Item> BA_SI_DI_GUA = REGISTRY.register("ba_si_di_gua", BaSiDiGuaItem::new);
	public static final RegistryObject<Item> BEI_JI_TIAN_XIA_MI_TAO_SE_LA = REGISTRY.register("bei_ji_tian_xia_mi_tao_se_la", BeiJiTianXiaMiTaoSeLaItem::new);
	public static final RegistryObject<Item> BI_SI_KAI_WAN_BING_GAN = REGISTRY.register("bi_si_kai_wan_bing_gan", BiSiKaiWanBingGanItem::new);
	public static final RegistryObject<Item> BU_SI_NIAO = REGISTRY.register("bu_si_niao", BuSiNiaoItem::new);
	public static final RegistryObject<Item> CHANG_FA_GONG_ZHU = REGISTRY.register("chang_fa_gong_zhu", ChangFaGongZhuItem::new);
	public static final RegistryObject<Item> CHAO_ROU_SI = REGISTRY.register("chao_rou_si", ChaoRouSiItem::new);
	public static final RegistryObject<Item> CHOU_DOU_FU = REGISTRY.register("chou_dou_fu", ChouDouFuItem::new);
	public static final RegistryObject<Item> CHUI_XUAN_FENG = REGISTRY.register("chui_xuan_feng", ChuiXuanFengItem::new);
	public static final RegistryObject<Item> CHUI_ZHU_YIN_CHUN = REGISTRY.register("chui_zhu_yin_chun", ChuiZhuYinChunItem::new);
	public static final RegistryObject<Item> CI_SHEN_PIN_PAN = REGISTRY.register("ci_shen_pin_pan", CiShenPinPanItem::new);
	public static final RegistryObject<Item> DA_BAN_SHAO = REGISTRY.register("da_ban_shao", DaBanShaoItem::new);
	public static final RegistryObject<Item> DA_JIANG_HU_CHUAN_JI = REGISTRY.register("da_jiang_hu_chuan_ji", DaJiangHuChuanJiItem::new);
	public static final RegistryObject<Item> DA_SHE_YAN = REGISTRY.register("da_she_yan", DaSheYanItem::new);
	public static final RegistryObject<Item> DI_YU_JI_XIN_JIN_GAO = REGISTRY.register("di_yu_ji_xin_jin_gao", DiYuJiXinJinGaoItem::new);
	public static final RegistryObject<Item> DOU_FU_GUO = REGISTRY.register("dou_fu_guo", DouFuGuoItem::new);
	public static final RegistryObject<Item> DOU_FU_WEI_CHENG = REGISTRY.register("dou_fu_wei_cheng", DouFuWeiChengItem::new);
	public static final RegistryObject<Item> DOU_JIA_ZHENG_GAO = REGISTRY.register("dou_jia_zheng_gao", DouJiaZhengGaoItem::new);
	public static final RegistryObject<Item> DU_ZHANG_HUA_YUAN = REGISTRY.register("du_zhang_hua_yuan", DuZhangHuaYuanItem::new);
	public static final RegistryObject<Item> ER_TIAN_LIU = REGISTRY.register("er_tian_liu", ErTianLiuItem::new);
	public static final RegistryObject<Item> FAN_TUAN = REGISTRY.register("fan_tuan", FanTuanItem::new);
	public static final RegistryObject<Item> FENG_MAO_ZI_CHA_HUI = REGISTRY.register("feng_mao_zi_cha_hui", FengMaoZiChaHuiItem::new);
	public static final RegistryObject<Item> FENG_ZI_DAN = REGISTRY.register("feng_zi_dan", FengZiDanItem::new);
	public static final RegistryObject<Item> HAI_DAN_CI_SHEN = REGISTRY.register("hai_dan_ci_shen", HaiDanCiShenItem::new);
	public static final RegistryObject<Item> HAI_DAN_XIN_XUAN_BING = REGISTRY.register("hai_dan_xin_xuan_bing", HaiDanXinXuanBingItem::new);
	public static final RegistryObject<Item> HAI_DAN_ZHENG_DAN = REGISTRY.register("hai_dan_zheng_dan", HaiDanZhengDanItem::new);
	public static final RegistryObject<Item> HAI_DAO_XUN_ROU = REGISTRY.register("hai_dao_xun_rou", HaiDaoXunRouItem::new);
	public static final RegistryObject<Item> HAI_XIAN_WEI_CHENG_TANG = REGISTRY.register("hai_xian_wei_cheng_tang", HaiXianWeiChengTangItem::new);
	public static final RegistryObject<Item> HAN_GONG_CHANG_JIAO = REGISTRY.register("han_gong_chang_jiao", HanGongChangJiaoItem::new);
	public static final RegistryObject<Item> HE_HUA_YU_MI_ZHAN = REGISTRY.register("he_hua_yu_mi_zhan", HeHuaYuMiZhanItem::new);
	public static final RegistryObject<Item> HE_TANG_YUE_SHE = REGISTRY.register("he_tang_yue_she", HeTangYueSheItem::new);
	public static final RegistryObject<Item> HONG_DOU_DA_FU = REGISTRY.register("hong_dou_da_fu", HongDouDaFuItem::new);
	public static final RegistryObject<Item> HONG_SHAO_MAN_YU = REGISTRY.register("hong_shao_man_yu", HongShaoManYuItem::new);
	public static final RegistryObject<Item> HUANG_YOU_NIU_PAI = REGISTRY.register("huang_you_niu_pai", HuangYouNiuPaiItem::new);
	public static final RegistryObject<Item> HUAN_JIN_SHU_YU_BIN = REGISTRY.register("huan_jin_shu_yu_bin", HuanJinShuYuBinItem::new);
	public static final RegistryObject<Item> HUAN_TAN_HUA_GAO = REGISTRY.register("huan_tan_hua_gao", HuanTanHuaGaoItem::new);
	public static final RegistryObject<Item> HUAN_XIANG_FENG_MI = REGISTRY.register("huan_xiang_feng_mi", HuanXiangFengMiItem::new);
	public static final RegistryObject<Item> HUAN_XIANG_FOU_TIAO_QIANG = REGISTRY.register("huan_xiang_fou_tiao_qiang", HuanXiangFouTiaoQiangItem::new);
	public static final RegistryObject<Item> HUAN_XIANG_XING_LIAN_CHUAN = REGISTRY.register("huan_xiang_xing_lian_chuan", HuanXiangXingLianChuanItem::new);
	public static final RegistryObject<Item> HUA_GUANG_YU_JIAN_BAO = REGISTRY.register("hua_guang_yu_jian_bao", HuaGuangYuJianBaoItem::new);
	public static final RegistryObject<Item> HUA_NIAO_FENG_YUE = REGISTRY.register("hua_niao_feng_yue", HuaNiaoFengYueItem::new);
	public static final RegistryObject<Item> HUI_LING_DUN_NIU_PAI = REGISTRY.register("hui_ling_dun_niu_pai", HuiLingDunNiuPaiItem::new);
	public static final RegistryObject<Item> HUO_XING = REGISTRY.register("huo_xing", HuoXingItem::new);
	public static final RegistryObject<Item> HU_LA_TANG = REGISTRY.register("hu_la_tang", HuLaTangItem::new);
	public static final RegistryObject<Item> JIN_XIA_DA_MAO_XIAN = REGISTRY.register("jin_xia_da_mao_xian", JinXiaDaMaoXianItem::new);
	public static final RegistryObject<Item> JUE_JIAO_GUAN_DOU_ZHU = REGISTRY.register("jue_jiao_guan_dou_zhu", JueJiaoGuanDouZhuItem::new);
	public static final RegistryObject<Item> JU_REN_YU_ZI_SHAO = REGISTRY.register("ju_ren_yu_zi_shao", JuRenYuZiShaoItem::new);
	public static final RegistryObject<Item> KAO_BA_MU_MAN = REGISTRY.register("kao_ba_mu_man", KaoBaMuManItem::new);
	public static final RegistryObject<Item> KAO_DI_GUA = REGISTRY.register("kao_di_gua", KaoDiGuaItem::new);
	public static final RegistryObject<Item> KAO_MO_GU = REGISTRY.register("kao_mo_gu", KaoMoGuItem::new);
	public static final RegistryObject<Item> LENG_DOU_FU = REGISTRY.register("leng_dou_fu", LengDouFuItem::new);
	public static final RegistryObject<Item> LIANG_CAI_DIAO_HUA = REGISTRY.register("liang_cai_diao_hua", LiangCaiDiaoHuaItem::new);
	public static final RegistryObject<Item> LIU_SHUI_SU_MIAN = REGISTRY.register("liu_shui_su_mian", LiuShuiSuMianItem::new);
	public static final RegistryObject<Item> LI_LIANG_TANG = REGISTRY.register("li_liang_tang", LiLiangTangItem::new);
	public static final RegistryObject<Item> LONG_YIN_TAO_ZI = REGISTRY.register("long_yin_tao_zi", LongYinTaoZiItem::new);
	public static final RegistryObject<Item> LUO_HAN_SHANG_SU = REGISTRY.register("luo_han_shang_su", LuoHanShangSuItem::new);
	public static final RegistryObject<Item> LU_SHUI_ZHU_DAN = REGISTRY.register("lu_shui_zhu_dan", LuShuiZhuDanItem::new);
	public static final RegistryObject<Item> LV_YE_XIAN_GU = REGISTRY.register("lv_ye_xian_gu", LvYeXianGuItem::new);
	public static final RegistryObject<Item> MAN_YU_NENG_DAN_JING = REGISTRY.register("man_yu_neng_dan_jing", ManYuNengDanJingItem::new);
	public static final RegistryObject<Item> MAO_FAN = REGISTRY.register("mao_fan", MaoFanItem::new);
	public static final RegistryObject<Item> MAO_MI_KE_LU_LI = REGISTRY.register("mao_mi_ke_lu_li", MaoMiKeLuLiItem::new);
	public static final RegistryObject<Item> MAO_MI_PI_SHA = REGISTRY.register("mao_mi_pi_sha", MaoMiPiShaItem::new);
	public static final RegistryObject<Item> MAO_MI_XI_SHUI = REGISTRY.register("mao_mi_xi_shui", MaoMiXiShuiItem::new);
	public static final RegistryObject<Item> MAO_YU_RONG_YAN_DOU_FU = REGISTRY.register("mao_yu_rong_yan_dou_fu", MaoYuRongYanDouFuItem::new);
	public static final RegistryObject<Item> MAO_YU_SAN_SE_BING_JI_LING = REGISTRY.register("mao_yu_san_se_bing_ji_ling", MaoYuSanSeBingJiLingItem::new);
	public static final RegistryObject<Item> MA_PO_DOU_FU = REGISTRY.register("ma_po_dou_fu", MaPoDouFuItem::new);
	public static final RegistryObject<Item> MA_SHU = REGISTRY.register("ma_shu", MaShuItem::new);
	public static final RegistryObject<Item> MEI_ZI_CHA_PAO_FAN = REGISTRY.register("mei_zi_cha_pao_fan", MeiZiChaPaoFanItem::new);
	public static final RegistryObject<Item> MI_QIAN_LI_ZI = REGISTRY.register("mi_qian_li_zi", MiQianLiZiItem::new);
	public static final RegistryObject<Item> MI_TAO_HONG_SHAO_ROU = REGISTRY.register("mi_tao_hong_shao_rou", MiTaoHongShaoRouItem::new);
	public static final RegistryObject<Item> MI_ZHI_CHA_SHAO = REGISTRY.register("mi_zhi_cha_shao", MiZhiChaShaoItem::new);
	public static final RegistryObject<Item> MI_ZHI_XIAN_JUN_BAO = REGISTRY.register("mi_zhi_xian_jun_bao", MiZhiXianJunBaoItem::new);
	public static final RegistryObject<Item> MI_ZHI_XIAO_YU_GAN = REGISTRY.register("mi_zhi_xiao_yu_gan", MiZhiXiaoYuGanItem::new);
	public static final RegistryObject<Item> MO_GU_ROU_PIAN = REGISTRY.register("mo_gu_rou_pian", MoGuRouPianItem::new);
	public static final RegistryObject<Item> MO_NV_DE_WU_TA_HUI = REGISTRY.register("mo_nv_de_wu_ta_hui", MoNvDeWuTaHuiItem::new);
	public static final RegistryObject<Item> NAI_XIANG_MO_GU_TANG = REGISTRY.register("nai_xiang_mo_gu_tang", NaiXiangMoGuTangItem::new);
	public static final RegistryObject<Item> NAI_YOU_JU_XIE = REGISTRY.register("nai_you_ju_xie", NaiYouJuXieItem::new);
	public static final RegistryObject<Item> NAI_YOU_TUN_CAI = REGISTRY.register("nai_you_tun_cai", NaiYouTunCaiItem::new);
	public static final RegistryObject<Item> NAN_GUA_XIA_ZHONG = REGISTRY.register("nan_gua_xia_zhong", NanGuaXiaZhongItem::new);
	public static final RegistryObject<Item> NENG_LIANG_CHUAN = REGISTRY.register("neng_liang_chuan", NengLiangChuanItem::new);
	public static final RegistryObject<Item> NIU_ROU_GAI_JIAO_FAN = REGISTRY.register("niu_rou_gai_jiao_fan", NiuRouGaiJiaoFanItem::new);
	public static final RegistryObject<Item> NIU_ROU_YUAN_YANG_HUO_GUO = REGISTRY.register("niu_rou_yuan_yang_huo_guo", NiuRouYuanYangHuoGuoItem::new);
	public static final RegistryObject<Item> NI_JIU_ZI_YU = REGISTRY.register("ni_jiu_zi_yu", NiJiuZiYuItem::new);
	public static final RegistryObject<Item> NI_ZHUAN_TIAN_DI = REGISTRY.register("ni_zhuan_tian_di", NiZhuanTianDiItem::new);
	public static final RegistryObject<Item> PENG_LAI_YU_ZHI = REGISTRY.register("peng_lai_yu_zhi", PengLaiYuZhiItem::new);
	public static final RegistryObject<Item> PU_TONG_XIA_DAN_GAO = REGISTRY.register("pu_tong_xia_dan_gao", PuTongXiaDanGaoItem::new);
	public static final RegistryObject<Item> QI_SHE_YANG_GENG = REGISTRY.register("qi_she_yang_geng", QiSheYangGengItem::new);
	public static final RegistryObject<Item> QUAN_ROU_SHENG_YAN = REGISTRY.register("quan_rou_sheng_yan", QuanRouShengYanItem::new);
	public static final RegistryObject<Item> RAN_JING_BU_DING = REGISTRY.register("ran_jing_bu_ding", RanJingBuDingItem::new);
	public static final RegistryObject<Item> RE_SONG_BING = REGISTRY.register("re_song_bing", ReSongBingItem::new);
	public static final RegistryObject<Item> SAI_XIONG_ZHANG = REGISTRY.register("sai_xiong_zhang", SaiXiongZhangItem::new);
	public static final RegistryObject<Item> SAN_WEN_YU_TIAN_FU_LUO = REGISTRY.register("san_wen_yu_tian_fu_luo", SanWenYuTianFuLuoItem::new);
	public static final RegistryObject<Item> SHANG_QI_ZHI_SHI_TIAO = REGISTRY.register("shang_qi_zhi_shi_tiao", ShangQiZhiShiTiaoItem::new);
	public static final RegistryObject<Item> SHENG_BAI_LIAN_ZI_GAO = REGISTRY.register("sheng_bai_lian_zi_gao", ShengBaiLianZiGaoItem::new);
	public static final RegistryObject<Item> SHENG_MING_ZHI_YUAN = REGISTRY.register("sheng_ming_zhi_yuan", ShengMingZhiYuanItem::new);
	public static final RegistryObject<Item> SHI_GUO_ZHU_SUN_DUN_ROU = REGISTRY.register("shi_guo_zhu_sun_dun_rou", ShiGuoZhuSunDunRouItem::new);
	public static final RegistryObject<Item> SHI_JIN_TIAN_FU_LUO = REGISTRY.register("shi_jin_tian_fu_luo", ShiJinTianFuLuoItem::new);
	public static final RegistryObject<Item> SHI_LI_YIN_XING = REGISTRY.register("shi_li_yin_xing", ShiLiYinXingItem::new);
	public static final RegistryObject<Item> SHI_ZI_TOU = REGISTRY.register("shi_zi_tou", ShiZiTouItem::new);
	public static final RegistryObject<Item> SHUI_JIAO = REGISTRY.register("shui_jiao", ShuiJiaoItem::new);
	public static final RegistryObject<Item> SHUI_ZHU_YU = REGISTRY.register("shui_zhu_yu", ShuiZhuYuItem::new);
	public static final RegistryObject<Item> SHU_CAI_ZHUAN_JI = REGISTRY.register("shu_cai_zhuan_ji", ShuCaiZhuanJiItem::new);
	public static final RegistryObject<Item> SI_KANG_BING = REGISTRY.register("si_kang_bing", SiKangBingItem::new);
	public static final RegistryObject<Item> SONG_ZI_GAO = REGISTRY.register("song_zi_gao", SongZiGaoItem::new);
	public static final RegistryObject<Item> SOU_MA_TUAN_ZI = REGISTRY.register("sou_ma_tuan_zi", SouMaTuanZiItem::new);
	public static final RegistryObject<Item> TAI_JI_BA_GUA_YU_DU = REGISTRY.register("tai_ji_ba_gua_yu_du", TaiJiBaGuaYuDuItem::new);
	public static final RegistryObject<Item> TANG_YUAN = REGISTRY.register("tang_yuan", TangYuanItem::new);
	public static final RegistryObject<Item> TAO_HUA_GENG = REGISTRY.register("tao_hua_geng", TaoHuaGengItem::new);
	public static final RegistryObject<Item> TAO_HUA_LIU_LI_JUAN = REGISTRY.register("tao_hua_liu_li_juan", TaoHuaLiuLiJuanItem::new);
	public static final RegistryObject<Item> TIAN_SHI_BAN_LI_MENG_GU = REGISTRY.register("tian_shi_ban_li_meng_gu", TianShiBanLiMengGuItem::new);
	public static final RegistryObject<Item> TI_SHEN_BU_DING = REGISTRY.register("ti_shen_bu_ding", TiShenBuDingItem::new);
	public static final RegistryObject<Item> TONG_LUO_SHAO = REGISTRY.register("tong_luo_shao", TongLuoShaoItem::new);
	public static final RegistryObject<Item> TUN_GU_LA_MIAN = REGISTRY.register("tun_gu_la_mian", TunGuLaMianItem::new);
	public static final RegistryObject<Item> TU_DOU_KE_LE_BING = REGISTRY.register("tu_dou_ke_le_bing", TuDouKeLeBingItem::new);
	public static final RegistryObject<Item> WEN_NUAN_FAN_TUAN = REGISTRY.register("wen_nuan_fan_tuan", WenNuanFanTuanItem::new);
	public static final RegistryObject<Item> WU_YI_SHI_YAO_GUAI_MU_SI = REGISTRY.register("wu_yi_shi_yao_guai_mu_si", WuYiShiYaoGuaiMuSiItem::new);
	public static final RegistryObject<Item> XIANG_CHUN_JIAN_BING = REGISTRY.register("xiang_chun_jian_bing", XiangChunJianBingItem::new);
	public static final RegistryObject<Item> XIANG_JIAN_SAN_WEN_YU = REGISTRY.register("xiang_jian_san_wen_yu", XiangJianSanWenYuItem::new);
	public static final RegistryObject<Item> XIANG_JIAN_SHUANG_GU_ROU_JUAN = REGISTRY.register("xiang_jian_shuang_gu_rou_juan", XiangJianShuangGuRouJuanItem::new);
	public static final RegistryObject<Item> XIANG_ZHA_CHAN_SHUI = REGISTRY.register("xiang_zha_chan_shui", XiangZhaChanShuiItem::new);
	public static final RegistryObject<Item> XIAO_XIAO_DE_TIAN_MI_DU_YAO = REGISTRY.register("xiao_xiao_de_tian_mi_du_yao", XiaoXiaoDeTianMiDuYaoItem::new);
	public static final RegistryObject<Item> XING_HONG_E_MO_DAN_GAO = REGISTRY.register("xing_hong_e_mo_dan_gao", XingHongEMoDanGaoItem::new);
	public static final RegistryObject<Item> YANG_WANG_TIAN_HUA_BAN_PAI = REGISTRY.register("yang_wang_tian_hua_ban_pai", YangWangTianHuaBanPaiItem::new);
	public static final RegistryObject<Item> YANG_XIN_ZHOU = REGISTRY.register("yang_xin_zhou", YangXinZhouItem::new);
	public static final RegistryObject<Item> YAN_HUANG_GUA = REGISTRY.register("yan_huang_gua", YanHuangGuaItem::new);
	public static final RegistryObject<Item> YAN_JIANG = REGISTRY.register("yan_jiang", YanJiangItem::new);
	public static final RegistryObject<Item> YE_WEI_JIA_NONG = REGISTRY.register("ye_wei_jia_nong", YeWeiJiaNongItem::new);
	public static final RegistryObject<Item> YING_LUO_XUE = REGISTRY.register("ying_luo_xue", YingLuoXueItem::new);
	public static final RegistryObject<Item> YIN_HUA_BU_DING = REGISTRY.register("yin_hua_bu_ding", YinHuaBuDingItem::new);
	public static final RegistryObject<Item> YIN_YU_SHUI_GUO_PAI = REGISTRY.register("yin_yu_shui_guo_pai", YinYuShuiGuoPaiItem::new);
	public static final RegistryObject<Item> YI_JI_BI_SHA = REGISTRY.register("yi_ji_bi_sha", YiJiBiShaItem::new);
	public static final RegistryObject<Item> YI_SHI_HUI_FAN = REGISTRY.register("yi_shi_hui_fan", YiShiHuiFanItem::new);
	public static final RegistryObject<Item> YOU_DOU_FU = REGISTRY.register("you_dou_fu", YouDouFuItem::new);
	public static final RegistryObject<Item> YOU_MENG = REGISTRY.register("you_meng", YouMengItem::new);
	public static final RegistryObject<Item> YUE_BING = REGISTRY.register("yue_bing", YueBingItem::new);
	public static final RegistryObject<Item> YUE_GUANG_TUAN_ZI = REGISTRY.register("yue_guang_tuan_zi", YueGuangTuanZiItem::new);
	public static final RegistryObject<Item> YUE_ZHI_LIAN_REN = REGISTRY.register("yue_zhi_lian_ren", YueZhiLianRenItem::new);
	public static final RegistryObject<Item> YUN_SHAN_MIAO_HUA_TANG = REGISTRY.register("yun_shan_miao_hua_tang", YunShanMiaoHuaTangItem::new);
	public static final RegistryObject<Item> YU_YUE_LONG_MEN = REGISTRY.register("yu_yue_long_men", YuYueLongMenItem::new);
	public static final RegistryObject<Item> ZA_CHUI = REGISTRY.register("za_chui", ZaChuiItem::new);
	public static final RegistryObject<Item> ZHANG_YU_SHAO = REGISTRY.register("zhang_yu_shao", ZhangYuShaoItem::new);
	public static final RegistryObject<Item> ZHA_BA_MU_MAN = REGISTRY.register("zha_ba_mu_man", ZhaBaMuManItem::new);
	public static final RegistryObject<Item> ZHA_FAN_QIE_TIAO = REGISTRY.register("zha_fan_qie_tiao", ZhaFanQieTiaoItem::new);
	public static final RegistryObject<Item> ZHA_XIA_TIAN_FU_LUO = REGISTRY.register("zha_xia_tian_fu_luo", ZhaXiaTianFuLuoItem::new);
	public static final RegistryObject<Item> ZHA_ZHU_ROU_PAI = REGISTRY.register("zha_zhu_rou_pai", ZhaZhuRouPaiItem::new);
	public static final RegistryObject<Item> ZHEN_HAI_XIAN_WEI_CHENG_TANG = REGISTRY.register("zhen_hai_xian_wei_cheng_tang", ZhenHaiXianWeiChengTangItem::new);
	public static final RegistryObject<Item> ZHI_SHI_DAN = REGISTRY.register("zhi_shi_dan", ZhiShiDanItem::new);
	public static final RegistryObject<Item> ZHI_ZHUNG_HAI_XIAN_MIAN = REGISTRY.register("zhi_zhung_hai_xian_mian", ZhiZhungHaiXianMianItem::new);
	public static final RegistryObject<Item> ZHI_ZHU_ROU_FAN_TUAN = REGISTRY.register("zhi_zhu_rou_fan_tuan", ZhiZhuRouFanTuanItem::new);
	public static final RegistryObject<Item> ZHU_DOU_FU = REGISTRY.register("zhu_dou_fu", ZhuDouFuItem::new);
	public static final RegistryObject<Item> ZHU_LU_DIE = REGISTRY.register("zhu_lu_die", ZhuLuDieItem::new);
	public static final RegistryObject<Item> ZHU_QU_JI = REGISTRY.register("zhu_qu_ji", ZhuQuJiItem::new);
	public static final RegistryObject<Item> ZHU_ROU_GAI_JIAO_FAN = REGISTRY.register("zhu_rou_gai_jiao_fan", ZhuRouGaiJiaoFanItem::new);
	public static final RegistryObject<Item> ZHU_ROU_ZUN_YU_XUN = REGISTRY.register("zhu_rou_zun_yu_xun", ZhuRouZunYuXunItem::new);
	public static final RegistryObject<Item> ZHU_SUN_CHAO_ROU = REGISTRY.register("zhu_sun_chao_rou", ZhuSunChaoRouItem::new);
	public static final RegistryObject<Item> ZHU_TONG_FEN_ZHENG_DAN = REGISTRY.register("zhu_tong_fen_zheng_dan", ZhuTongFenZhengDanItem::new);
	public static final RegistryObject<Item> ZHU_TONG_SHAO_ZUI_XIA = REGISTRY.register("zhu_tong_shao_zui_xia", ZhuTongShaoZuiXiaItem::new);
	public static final RegistryObject<Item> ZHU_TONG_ZHENG_DAN = REGISTRY.register("zhu_tong_zheng_dan", ZhuTongZhengDanItem::new);
	//beverages
	public static final RegistryObject<Item> A_FU_JIA_DUO = REGISTRY.register("a_fu_jia_duo", AFuJiaDuoItem::new);
	public static final RegistryObject<Item> BING_SHAN_MAO_YU_DONG_NING = REGISTRY.register("bing_shan_mao_yu_dong_ning", BingShanMaoYuDongNingItem::new);
	public static final RegistryObject<Item> BO_ZI_QI_SHUI = REGISTRY.register("bo_zi_qi_shui", BoZiQiShuiItem::new);
	public static final RegistryObject<Item> CHAO_ZUN_PI_JIU = REGISTRY.register("chao_zun_pi_jiu", ChaoZUNPiJiuItem::new);
	public static final RegistryObject<Item> DA_BING_GUN_ER = REGISTRY.register("da_bing_gun_er", DaBingGunErItem::new);
	public static final RegistryObject<Item> DA_YIN_NIANG = REGISTRY.register("da_yin_niang", DaYinNiangItem::new);
	public static final RegistryObject<Item> DONG_NIANG = REGISTRY.register("dong_niang", DongNiangItem::new);
	public static final RegistryObject<Item> FENG_ZHU = REGISTRY.register("feng_zhu", FengZhuItem::new);
	public static final RegistryObject<Item> GUI_SHA = REGISTRY.register("gui_sha", GuiShaItem::new);
	public static final RegistryObject<Item> GUO_WEI_HIGH_BALL = REGISTRY.register("guo_wei_high_ball", GuoWeiHighBallItem::new);
	public static final RegistryObject<Item> GUO_WEI_SOUR = REGISTRY.register("guo_wei_sour", GuoWeiSOURItem::new);
	public static final RegistryObject<Item> GU_FA_NAI_YOU_BING_SHA = REGISTRY.register("gu_fa_nai_you_bing_sha", GuFaNaiYouBingShaItem::new);
	public static final RegistryObject<Item> GU_MING_DI_BING_JI_LING = REGISTRY.register("gu_ming_di_bing_ji_ling", GuMingDiBingJiLingItem::new);
	public static final RegistryObject<Item> HAI_DE_NV_ER = REGISTRY.register("hai_de_nv_er", HaiDeNvErItem::new);
	public static final RegistryObject<Item> HONG_MO_GUAN_HONG_CHA = REGISTRY.register("hong_mo_guan_hong_cha", HongMoGuanHongChaItem::new);
	public static final RegistryObject<Item> HONG_WU = REGISTRY.register("hong_wu", HongWuItem::new);
	public static final RegistryObject<Item> HONG_YOU_GUO_ZHI = REGISTRY.register("hong_you_guo_zhi", HongYouGuoZhiItem::new);
	public static final RegistryObject<Item> HUO_SHU_QIU = REGISTRY.register("huo_shu_qiu", HuoShuQiuItem::new);
	public static final RegistryObject<Item> JIAO_FU = REGISTRY.register("jiao_fu", JiaoFuItem::new);
	public static final RegistryObject<Item> KA_PEI = REGISTRY.register("ka_pei", KaPeiItem::new);
	public static final RegistryObject<Item> LIN_REN_ZHUI = REGISTRY.register("lin_ren_zhui", LinRenZhuiItem::new);
	public static final RegistryObject<Item> LU_CHA = REGISTRY.register("lu_cha", LuChaItem::new);
	public static final RegistryObject<Item> MEI_JIU = REGISTRY.register("mei_jiu", MeiJiuItem::new);
	public static final RegistryObject<Item> MO_JIE_KA_PEI = REGISTRY.register("mo_jie_ka_pei", MoJieKaPeiItem::new);
	public static final RegistryObject<Item> MO_JI_TUO_BAO_JIANG_QIU = REGISTRY.register("mo_ji_tuo_bao_jiang_qiu", MoJiTuoBaoJiangQiuItem::new);
	public static final RegistryObject<Item> NIU_NAI = REGISTRY.register("niu_nai", NiuNaiItem::new);
	public static final RegistryObject<Item> NI_GE_LUO_NI = REGISTRY.register("ni_ge_luo_ni", NiGeLuoNiItem::new);
	public static final RegistryObject<Item> PU_TONG_JIAN_SHEN_CHA = REGISTRY.register("pu_tong_jian_shen_cha", PuTongJianShenChaItem::new);
	public static final RegistryObject<Item> QI = REGISTRY.register("qi", QiItem::new);
	public static final RegistryObject<Item> QI_BAO_JIAN = REGISTRY.register("qi_bao_jian", QiBaoJianItem::new);
	public static final RegistryObject<Item> QI_LIN = REGISTRY.register("qi_lin", QiLinItem::new);
	public static final RegistryObject<Item> QUE_JIU = REGISTRY.register("que_jiu", QueJiuItem::new);
	public static final RegistryObject<Item> RI_YUE_XING = REGISTRY.register("ri_yue_xing", RiYueXingItem::new);
	public static final RegistryObject<Item> SHEN_ZHI_MAI = REGISTRY.register("shen_zhi_mai", ShenZhiMaiItem::new);
	public static final RegistryObject<Item> SHI_SI_YE = REGISTRY.register("shi_si_ye", ShiSiYeItem::new);
	public static final RegistryObject<Item> SHUI_TA_JI = REGISTRY.register("shui_ta_ji", ShuiTaJiItem::new);
	public static final RegistryObject<Item> TAI_KONG_PI_JIU = REGISTRY.register("tai_kong_pi_jiu", TaiKongPiJiuItem::new);
	public static final RegistryObject<Item> TIAN_DI_WU_YON = REGISTRY.register("tian_di_wu_yon", TianDiWuYonItem::new);
	public static final RegistryObject<Item> TIAN_GOU_YONG = REGISTRY.register("tian_gou_yong", TianGouYongItem::new);
	public static final RegistryObject<Item> WEI_XIN_BING_KA_PEI = REGISTRY.register("wei_xin_bing_ka_pei", WeiXinBingKaPeiItem::new);
	public static final RegistryObject<Item> XIAO = REGISTRY.register("xiao", XiaoItem::new);
	public static final RegistryObject<Item> XING_HONG_E_MO = REGISTRY.register("xing_hong_e_mo", XingHongEMoItem::new);
	public static final RegistryObject<Item> YANG_ZHI_GAN_LU = REGISTRY.register("yang_zhi_gan_lu", YangZhiGanLuItem::new);
	public static final RegistryObject<Item> YAO_JING_YU_LU = REGISTRY.register("yao_jing_yu_lu", YaoJingYuLuItem::new);
	public static final RegistryObject<Item> YUE_MIAN_HUO_JIAN = REGISTRY.register("yue_mian_huo_jian", YueMianHuoJianItem::new);
	public static final RegistryObject<Item> YU_LU_CHA = REGISTRY.register("yu_lu_cha", YuLuChaItem::new);
	//others
	public static final RegistryObject<Item> HEI_AN_WU_ZHI = REGISTRY.register("hei_an_wu_zhi", HeiAnWuZhiItem::new);
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", IconItem::new);
	public static final RegistryObject<Item> REISEN = REGISTRY.register("reisen", LingXianItem::new);
	public static final RegistryObject<Item> EN_1 = REGISTRY.register("en_1", En1Item::new);
	public static final RegistryObject<Item> EN_5 = REGISTRY.register("en_5", En5Item::new);
	public static final RegistryObject<Item> EN_10 = REGISTRY.register("en_10", En10Item::new);
	public static final RegistryObject<Item> EN_10K = REGISTRY.register("en_10k", En10kItem::new);
	public static final RegistryObject<Item> IRON_KNIFE = REGISTRY.register("iron_knife", IronKnifeItem::new);
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}