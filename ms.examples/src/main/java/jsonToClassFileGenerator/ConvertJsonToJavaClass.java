package jsonToClassFileGenerator;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class ConvertJsonToJavaClass {

    public void convertJsonToJavaClass1(URL inputJsonUrl, File outputJavaClassDirectory, String packageName,
            String javaClassName)
            throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };
        
        SchemaMapper mapper = new SchemaMapper(
                new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }

    public static void main(String[] args) throws MalformedURLException, IOException {
        ConvertJsonToJavaClass convertJsonToJavaClass = new ConvertJsonToJavaClass();
        convertJsonToJavaClass.convertJsonToJavaClass1(new URL("https://randomuser.me/api/"), 
                new File("D:\\swarnkar\\STS-workspace\\exs\\ms.examples\\src\\main\\java\\jsonToClassFileGenerator"), 
                "", 
                "Result");
        System.out.println("Generated class files");

    }

}
