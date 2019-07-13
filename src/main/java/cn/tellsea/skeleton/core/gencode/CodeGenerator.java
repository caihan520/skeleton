package cn.tellsea.skeleton.core.gencode;

/**
 * 代码生成工具
 *
 * @author Tellsea
 * @Description Created on 2019/7/13
 */
public class CodeGenerator {

    public static void main(String[] args) {
//        genCodeByAll();
//        genCodeByOne("dept");
        genCodeByMore("user_role", "role_resource");
    }

    /**
     * 根据单个表名称生成
     *
     * @param tableName
     */
    public static void genCodeByOne(String tableName) {
        CodeGeneratorConfig.genModelAndMapper(tableName);
        CodeGeneratorConfig.genService(tableName);
        CodeGeneratorConfig.genController(tableName);
    }

    /**
     * 根据多个表名称生成
     *
     * @param tableNames
     */
    public static void genCodeByMore(String... tableNames) {
        for (String tableName : tableNames) {
            genCodeByOne(tableName);
        }
    }

    /**
     * 根据数据库所有表生成
     */
    public static void genCodeByAll() {
        CodeGeneratorConfig.getTableNameList().forEach(name -> genCodeByOne(name));
    }
}
