package views;

import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;
// import @ [1:1]
import io.sinistral.models.*;
// import @ [2:1]
import java.util.List;

/*
 * Auto generated code to render template views/Fortunes.rocker.html
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@SuppressWarnings("unused")
public class Fortunes extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public com.fizzed.rocker.ContentType getContentType() { return com.fizzed.rocker.ContentType.HTML; }
    static public String getTemplateName() { return "Fortunes.rocker.html"; }
    static public String getTemplatePackageName() { return "views"; }
    static public String getHeaderHash() { return "331039920"; }
    static public long getModifiedAt() { return 1558430324000L; }
    static public String[] getArgumentNames() { return new String[] { "items" }; }

    // argument @ [3:2]
    private List<Fortune> items;

    public Fortunes items(List<Fortune> items) {
        this.items = items;
        return this;
    }

    public List<Fortune> items() {
        return this.items;
    }

    static public Fortunes template(List<Fortune> items) {
        return new Fortunes()
            .items(items);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // <!DOCTYPE html><html><head><title>Fortunes</title></head><body><table><tr><th>id</th><th>message</th></tr>
        static private final byte[] PLAIN_TEXT_0_0;
        // <tr><td>
        static private final byte[] PLAIN_TEXT_1_0;
        // </td><td>
        static private final byte[] PLAIN_TEXT_2_0;
        // </td></tr>
        static private final byte[] PLAIN_TEXT_3_0;
        // </table></body></html>
        static private final byte[] PLAIN_TEXT_4_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(Fortunes.class.getClassLoader(), Fortunes.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
        }

        // argument @ [3:2]
        protected final List<Fortune> items;

        public Template(Fortunes model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(getContentType());
            __internal.setTemplateName(getTemplateName());
            __internal.setTemplatePackageName(getTemplatePackageName());
            this.items = model.items();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [3:28]
            __internal.aboutToExecutePosInTemplate(3, 28);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ForBlockBegin @ [4:107]
            __internal.aboutToExecutePosInTemplate(4, 107);
            try {
                com.fizzed.rocker.runtime.Java8Iterator.forEach(items, (i,item) -> {
                    try {
                        // PlainText @ [4:133]
                        __internal.aboutToExecutePosInTemplate(4, 133);
                        __internal.writeValue(PLAIN_TEXT_1_0);
                        // ValueExpression @ [4:141]
                        __internal.aboutToExecutePosInTemplate(4, 141);
                        __internal.renderValue(item.id, false);
                        // PlainText @ [4:149]
                        __internal.aboutToExecutePosInTemplate(4, 149);
                        __internal.writeValue(PLAIN_TEXT_2_0);
                        // ValueExpression @ [4:158]
                        __internal.aboutToExecutePosInTemplate(4, 158);
                        __internal.renderValue(item.message, false);
                        // PlainText @ [4:171]
                        __internal.aboutToExecutePosInTemplate(4, 171);
                        __internal.writeValue(PLAIN_TEXT_3_0);
                        // ForBlockEnd @ [4:107]
                        __internal.aboutToExecutePosInTemplate(4, 107);
                    } catch (com.fizzed.rocker.runtime.ContinueException e) {
                        // support for continuing for loops
                    }
                }); // for end @ [4:107]
            } catch (com.fizzed.rocker.runtime.BreakException e) {
                // support for breaking for loops
            }
            // PlainText @ [4:182]
            __internal.aboutToExecutePosInTemplate(4, 182);
            __internal.writeValue(PLAIN_TEXT_4_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "<!DOCTYPE html><html><head><title>Fortunes</title></head><body><table><tr><th>id</th><th>message</th></tr>";
        static private final String PLAIN_TEXT_1_0 = "<tr><td>";
        static private final String PLAIN_TEXT_2_0 = "</td><td>";
        static private final String PLAIN_TEXT_3_0 = "</td></tr>";
        static private final String PLAIN_TEXT_4_0 = "</table></body></html>";

    }

}
