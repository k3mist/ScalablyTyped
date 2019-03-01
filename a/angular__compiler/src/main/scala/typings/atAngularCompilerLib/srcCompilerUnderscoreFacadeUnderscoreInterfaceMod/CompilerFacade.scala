package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3PipeMetadataFacade): js.Any
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    compileComponent: js.Function3[CoreEnvironment, java.lang.String, R3ComponentMetadataFacade, js.Any],
    compileDirective: js.Function3[CoreEnvironment, java.lang.String, R3DirectiveMetadataFacade, js.Any],
    compileInjectable: js.Function3[CoreEnvironment, java.lang.String, R3InjectableMetadataFacade, js.Any],
    compileInjector: js.Function3[CoreEnvironment, java.lang.String, R3InjectorMetadataFacade, js.Any],
    compileNgModule: js.Function3[CoreEnvironment, java.lang.String, R3NgModuleMetadataFacade, js.Any],
    compilePipe: js.Function3[CoreEnvironment, java.lang.String, R3PipeMetadataFacade, js.Any]
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3ResolvedDependencyType = R3ResolvedDependencyType, compileComponent = compileComponent, compileDirective = compileDirective, compileInjectable = compileInjectable, compileInjector = compileInjector, compileNgModule = compileNgModule, compilePipe = compilePipe)
  
    __obj.asInstanceOf[CompilerFacade]
  }
}

