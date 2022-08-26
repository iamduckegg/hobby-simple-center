package net.zxy.center.common.utils;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成器
 *
 * @Author zx
 * @Date 2021/1/21 0021
 **/
public class CodeUtil {

	public static void main(String[] args) {
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		//获取项目路径
		String projectPath = System.getProperty("user.dir");
		//代码路径
		gc.setOutputDir("C:\\Users\\ruohuo\\Desktop\\代码生成");
		//作者
		gc.setAuthor("zx");
		//是否打开文件夹
		gc.setOpen(true);
		//实体属性 Swagger2 注解
//		gc.setSwagger2(true);
		// 基本的字段映射
		gc.setBaseResultMap(true);
		// 是否覆盖同名文件，默认是false
		gc.setFileOverride(true);
		// 不需要ActiveRecord特性的请改为false
		gc.setActiveRecord(false);
		// XML 二级缓存
		gc.setEnableCache(false);
		// 基本的sql片段
		gc.setBaseColumnList(true);
		//时间类型对应策略
//		gc.setDateType(DateType.TIME_PACK);
		//指定生成的主键的ID类型
//		gc.setIdType(IdType.NONE);
		/* 自定义文件命名，%s为实体名 */
//		gc.setMapperName("%sMapper");
//		gc.setXmlName("%sMapper");
//		gc.setServiceName("%sService");
//		gc.setServiceImplName("%sServiceImpl");
//		gc.setControllerName("%sController");
		gc.setEntityName("%sPO");
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl("jdbc:mysql://localhost:3306/center?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false&serverTimezone=GMT");
		// dsc.setSchemaName("public");
		dsc.setDriverName("com.mysql.cj.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("1234");
		mpg.setDataSource(dsc);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("net.zxy.center");
		pc.setController("web.core");
		pc.setService("service.core");
		pc.setServiceImpl("service.impl.core");
		pc.setMapper("dao.core");
		pc.setEntity("po.core");
		pc.setXml("mapper");

		mpg.setPackageInfo(pc);

		/*// 自定义配置
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				// to do nothing
			}
		};
		// 如果模板引擎是 freemarker
		String templatePath = "/templates/mapper.xml.ftl";
		// 如果模板引擎是 velocity
//		String templatePath = "/templates/mapper.xml.vm";
		// 自定义输出配置
		List<FileOutConfig> focList = new ArrayList<>();
		// 自定义配置会被优先输出
		focList.add(new FileOutConfig(templatePath) {
			@Override
			public String outputFile(TableInfo tableInfo) {
//				// 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
				return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
						+ "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
			}
		});
        cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录，自定义目录用");
                if (fileType == FileType.MAPPER) {
                    // 已经生成 mapper 文件判断存在，不想重新生成返回 false
                    return !new File(filePath).exists();
                }
                // 允许生成模板文件
                return true;
            }
        });
		cfg.setFileOutConfigList(focList);
		mpg.setCfg(cfg);*/

		// 配置模板
		// 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
		// 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
//		TemplateConfig templateConfig = new TemplateConfig();
//		templateConfig.setController("");
//		templateConfig.setEntity("");
//		templateConfig.setMapper("");
//		templateConfig.setXml("");
//		templateConfig.setService("");
//		templateConfig.setServiceImpl("");
		// 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
//		mpg.setTemplate(templateConfig);

		// 数据库表配置
		StrategyConfig strategy = new StrategyConfig();
		// 此处可以修改为您的表前缀
		strategy.setTablePrefix("cc");
		// 表名生成策略 驼峰
		strategy.setNaming(NamingStrategy.underline_to_camel);
		//列的名称，使用驼峰规则
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		//是否使用lombok
		strategy.setEntityLombokModel(true);
		//是否生成 @RestController 控制器
		strategy.setRestControllerStyle(true);
		// 公共父类
//		strategy.setSuperMapperClass(null);
		// 需要生成的表
		strategy.setInclude("cc_dict");
		// 自定义实体父类
		strategy.setSuperEntityClass("net.zxy.center.po.base.BasePO");
		// 自定义 service 实现类父类
//		strategy.setSuperServiceImplClass("");
		// 自定义 controller 父类
//		strategy.setSuperControllerClass("");
		// 写于父类中的公共字段
//		strategy.setSuperEntityColumns("id");



//		strategy.setControllerMappingHyphenStyle(true);
		//乐观锁
//		strategy.setVersionFieldName("version");
		mpg.setStrategy(strategy);

		//模板引擎
//		mpg.setTemplateEngine(new FreemarkerTemplateEngine());

		mpg.execute();
	}


}
