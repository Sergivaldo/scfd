package junior.sergivaldo.scfd.entity.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;

@Mojo(name = "entity", defaultPhase = LifecyclePhase.NONE)
public class EntityMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true)
    MavenProject project;

    @Parameter(property = "name", required = true, readonly = true)
    String name;

    @Parameter(property = "props", required = true, readonly = true)
    List<String> props;

    @Parameter(property = "schema", readonly = true)
    String schema;

    @Parameter(property = "table", readonly = true)
    String table;

    @Parameter(property = "useUUID", defaultValue = "false", readonly = true)
    boolean useUUID;

    @Parameter(property = "auditable", defaultValue = "false", readonly = true)
    boolean auditable;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
