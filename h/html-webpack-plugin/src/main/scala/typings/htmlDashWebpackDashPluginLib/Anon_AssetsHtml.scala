package typings
package htmlDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetsHtml extends js.Object {
  var assets: Anon_Css
  var html: java.lang.String
  var outputName: java.lang.String
  var plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
}

object Anon_AssetsHtml {
  @scala.inline
  def apply(
    assets: Anon_Css,
    html: java.lang.String,
    outputName: java.lang.String,
    plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
  ): Anon_AssetsHtml = {
    val __obj = js.Dynamic.literal(assets = assets, html = html, outputName = outputName, plugin = plugin)
  
    __obj.asInstanceOf[Anon_AssetsHtml]
  }
}

