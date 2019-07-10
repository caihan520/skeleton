package ${basePackageController};

import ${basePackage}.base.controller.BaseController;
import ${basePackage}.entity.${modelNameUpperCamel};
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Description: ${modelNameUpperCamel} 控制层
* @author ${author}
* @date ${date}
*/
@Controller
@RequestMapping("/${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller extends BaseController<${modelNameUpperCamel}> {

}
