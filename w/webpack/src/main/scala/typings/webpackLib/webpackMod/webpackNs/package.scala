package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackNs {
  type AuxiliaryCommentObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in webpack.webpack.webpack.LibraryTarget ]: string}
    */ webpackLib.webpackLibStrings.AuxiliaryCommentObject with js.Any
  /**
    * Plugins
    */
  type BannerPlugin = Plugin
  /**
    * @deprecated Use RuleSetCondition instead
    */
  type Condition = RuleSetCondition
  type ContextReplacementPlugin = Plugin
  type DefinePlugin = Plugin
  type DllPlugin = Plugin
  type DllReferencePlugin = Plugin
  type EntryFunc = js.Function0[
    java.lang.String | js.Array[java.lang.String] | Entry | (js.Promise[java.lang.String | js.Array[java.lang.String] | Entry])
  ]
  type EnvironmentPlugin = Plugin
  type EvalSourceMapDevToolPlugin = Plugin
  /** @deprecated use webpack.EvalSourceMapDevToolPlugin.Options */
  type EvalSourceMapDevToolPluginOptions = webpackLib.webpackMod.webpackNs.EvalSourceMapDevToolPluginNs.Options
  type ExtendedAPIPlugin = Plugin
  type ExternalsElement = java.lang.String | stdLib.RegExp | ExternalsObjectElement | ExternalsFunctionElement
  type ExternalsFunctionElement = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit], 
    js.Any
  ]
  type HashedModuleIdsPlugin = Plugin
  type HotModuleReplacementPlugin = Plugin
  type IgnorePlugin = Plugin
  type Loader = java.lang.String | NewLoader
  type LoaderOptionsPlugin = Plugin
  type NamedChunksPlugin = Plugin
  /** @deprecated use config.optimization.namedModules */
  type NamedModulesPlugin = Plugin
  /** @deprecated use config.optimization.noEmitOnErrors */
  type NoEmitOnErrorsPlugin = Plugin
  type NormalModuleReplacementPlugin = Plugin
  /** @deprecated use webpack.Options.Performance */
  type PerformanceOptions = webpackLib.webpackMod.webpackNs.OptionsNs.Performance
  type PrefetchPlugin = Plugin
  type ProgressPlugin = Plugin
  type ProvidePlugin = Plugin
  /**
    * @deprecated Use RuleSetRule instead
    */
  type Rule = RuleSetRule
  type RuleSetCondition = _RuleSetCondition | (js.Function1[/* path */ java.lang.String, scala.Boolean]) | stdLib.RegExp | java.lang.String
  type RuleSetQuery = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type RuleSetUse = RuleSetUseItem | js.Array[RuleSetUseItem] | (js.Function1[/* data */ js.Any, RuleSetUseItem | js.Array[RuleSetUseItem]])
  type RuleSetUseItem = java.lang.String | RuleSetLoader | (js.Function1[/* data */ js.Any, java.lang.String | RuleSetLoader])
  type SingleEntryPlugin = Plugin
  type SourceMapDevToolPlugin = Plugin
  /** @deprecated use webpack.SourceMapDevToolPlugin.Options */
  type SourceMapDevToolPluginOptions = webpackLib.webpackMod.webpackNs.SourceMapDevToolPluginNs.Options
  type SplitChunksPlugin = Plugin
  /** @deprecated use webpack.optimize.UglifyJsPlugin.CommentFilter */
  type UglifyCommentFunction = webpackLib.webpackMod.webpackNs.optimizeNs.UglifyJsPluginNs.CommentFilter
  /** @deprecated use webpack.optimize.UglifyJsPlugin.Options */
  type UglifyPluginOptions = webpackLib.webpackMod.webpackNs.optimizeNs.UglifyJsPluginNs.Options
  type WatchIgnorePlugin = Plugin
  /** @deprecated use webpack.Options.WatchOptions */
  type WatchOptions = webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions
}
