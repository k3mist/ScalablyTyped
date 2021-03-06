package typings
package atAngularCompilerLib.srcMetadataUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/metadata_resolver", "CompileMetadataResolver")
@js.native
class CompileMetadataResolver protected () extends js.Object {
  def this(_config: atAngularCompilerLib.srcConfigMod.CompilerConfig, _htmlParser: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser, _ngModuleResolver: atAngularCompilerLib.srcNgUnderscoreModuleUnderscoreResolverMod.NgModuleResolver, _directiveResolver: atAngularCompilerLib.srcDirectiveUnderscoreResolverMod.DirectiveResolver, _pipeResolver: atAngularCompilerLib.srcPipeUnderscoreResolverMod.PipeResolver, _summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[_], _schemaRegistry: atAngularCompilerLib.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry, _directiveNormalizer: atAngularCompilerLib.srcDirectiveUnderscoreNormalizerMod.DirectiveNormalizer, _console: atAngularCompilerLib.srcUtilMod.Console, _staticSymbolCache: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache, _reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  def this(_config: atAngularCompilerLib.srcConfigMod.CompilerConfig, _htmlParser: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser, _ngModuleResolver: atAngularCompilerLib.srcNgUnderscoreModuleUnderscoreResolverMod.NgModuleResolver, _directiveResolver: atAngularCompilerLib.srcDirectiveUnderscoreResolverMod.DirectiveResolver, _pipeResolver: atAngularCompilerLib.srcPipeUnderscoreResolverMod.PipeResolver, _summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[_], _schemaRegistry: atAngularCompilerLib.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry, _directiveNormalizer: atAngularCompilerLib.srcDirectiveUnderscoreNormalizerMod.DirectiveNormalizer, _console: atAngularCompilerLib.srcUtilMod.Console, _staticSymbolCache: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache, _reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector, _errorCollector: ErrorCollector) = this()
  var _addTypeToModule: js.Any = js.native
  var _checkSelfImport: js.Any = js.native
  var _config: js.Any = js.native
  var _console: js.Any = js.native
  var _createProxyClass: js.Any = js.native
  var _directiveCache: js.Any = js.native
  var _directiveNormalizer: js.Any = js.native
  var _directiveResolver: js.Any = js.native
  var _errorCollector: js.UndefOr[js.Any] = js.native
  var _getDependenciesMetadata: js.Any = js.native
  var _getEntryComponentMetadata: js.Any = js.native
  var _getEntryComponentsFromProvider: js.Any = js.native
  var _getFactoryMetadata: js.Any = js.native
  var _getIdentifierMetadata: js.Any = js.native
  var _getInjectableTypeMetadata: js.Any = js.native
  var _getProvidersMetadata: js.Any = js.native
  var _getQueriesMetadata: js.Any = js.native
  var _getQueryMetadata: js.Any = js.native
  var _getTokenMetadata: js.Any = js.native
  var _getTransitiveNgModuleMetadata: js.Any = js.native
  var _getTypeDescriptor: js.Any = js.native
  var _getTypeMetadata: js.Any = js.native
  var _htmlParser: js.Any = js.native
  var _loadPipeMetadata: js.Any = js.native
  var _loadSummary: js.Any = js.native
  var _ngModuleCache: js.Any = js.native
  var _ngModuleOfTypes: js.Any = js.native
  var _ngModuleResolver: js.Any = js.native
  var _nonNormalizedDirectiveCache: js.Any = js.native
  var _pipeCache: js.Any = js.native
  var _pipeResolver: js.Any = js.native
  var _queryVarBindings: js.Any = js.native
  var _reflector: js.Any = js.native
  var _reportError: js.Any = js.native
  var _schemaRegistry: js.Any = js.native
  var _shallowModuleCache: js.Any = js.native
  var _staticSymbolCache: js.Any = js.native
  var _summaryCache: js.Any = js.native
  var _summaryResolver: js.Any = js.native
  var _validateProvider: js.Any = js.native
  var getComponentFactory: js.Any = js.native
  var getComponentViewClass: js.Any = js.native
  var getGeneratedClass: js.Any = js.native
  var getRendererType: js.Any = js.native
  var initComponentFactory: js.Any = js.native
  def clearCache(): scala.Unit = js.native
  def clearCacheFor(`type`: atAngularCompilerLib.srcCoreMod.Type): scala.Unit = js.native
  /**
    * Gets the metadata for the given directive.
    * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
    */
  def getDirectiveMetadata(directiveType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata = js.native
  def getDirectiveSummary(dirType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary = js.native
  def getHostComponentMetadata(compMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata = js.native
  def getHostComponentMetadata(
    compMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    hostViewType: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol
  ): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata = js.native
  def getHostComponentMetadata(
    compMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    hostViewType: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass
  ): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata = js.native
  def getHostComponentType(dirType: js.Any): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass = js.native
  def getHostComponentViewClass(dirType: js.Any): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol | atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProxyClass = js.native
  def getInjectableMetadata(`type`: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata | scala.Null = js.native
  def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[_]): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata | scala.Null = js.native
  def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[_], throwOnUnknownDeps: scala.Boolean): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata | scala.Null = js.native
  def getInjectableMetadata(`type`: js.Any, dependencies: scala.Null, throwOnUnknownDeps: scala.Boolean): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata | scala.Null = js.native
  def getInjectableSummary(`type`: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeSummary = js.native
  def getNgModuleMetadata(moduleType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata | scala.Null = js.native
  def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: scala.Boolean): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata | scala.Null = js.native
  def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: scala.Boolean, alreadyCollecting: stdLib.Set[_]): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata | scala.Null = js.native
  def getNgModuleSummary(moduleType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary | scala.Null = js.native
  def getNgModuleSummary(moduleType: js.Any, alreadyCollecting: stdLib.Set[_]): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary | scala.Null = js.native
  def getNonNormalizedDirectiveMetadata(directiveType: js.Any): atAngularCompilerLib.Anon_Annotation | scala.Null = js.native
  def getOrLoadPipeMetadata(pipeType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeMetadata = js.native
  /**
    * Gets the metadata for the given pipe.
    * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
    */
  def getPipeMetadata(pipeType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeMetadata | scala.Null = js.native
  def getPipeSummary(pipeType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary = js.native
  def getProviderMetadata(provider: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.ProviderMeta): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata = js.native
  def getReflector(): atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector = js.native
  def getShallowModuleMetadata(moduleType: js.Any): atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileShallowModuleMetadata | scala.Null = js.native
  def isDirective(`type`: js.Any): scala.Boolean = js.native
  def isInjectable(`type`: js.Any): scala.Boolean = js.native
  def isNgModule(`type`: js.Any): scala.Boolean = js.native
  def isPipe(`type`: js.Any): scala.Boolean = js.native
  def loadDirectiveMetadata(ngModuleType: js.Any, directiveType: js.Any, isSync: scala.Boolean): atAngularCompilerLib.srcUtilMod.SyncAsync[scala.Null] = js.native
  /**
    * Loads the declared directives and pipes of an NgModule.
    */
  def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: scala.Boolean): js.Promise[_] = js.native
  def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: scala.Boolean, throwIfNotFound: scala.Boolean): js.Promise[_] = js.native
}

