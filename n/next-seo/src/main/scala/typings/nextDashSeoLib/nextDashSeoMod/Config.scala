package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var canonical: js.UndefOr[java.lang.String] = js.undefined
  var dangerouslySetAllPagesToNoIndex: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var facebook: js.UndefOr[Facebook] = js.undefined
  var noindex: js.UndefOr[scala.Boolean] = js.undefined
  var openGraph: js.UndefOr[OpenGraph] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTemplate: js.UndefOr[java.lang.String] = js.undefined
  var twitter: js.UndefOr[Twitter] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    canonical: java.lang.String = null,
    dangerouslySetAllPagesToNoIndex: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    facebook: Facebook = null,
    noindex: js.UndefOr[scala.Boolean] = js.undefined,
    openGraph: OpenGraph = null,
    title: java.lang.String = null,
    titleTemplate: java.lang.String = null,
    twitter: Twitter = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (canonical != null) __obj.updateDynamic("canonical")(canonical)
    if (!js.isUndefined(dangerouslySetAllPagesToNoIndex)) __obj.updateDynamic("dangerouslySetAllPagesToNoIndex")(dangerouslySetAllPagesToNoIndex)
    if (description != null) __obj.updateDynamic("description")(description)
    if (facebook != null) __obj.updateDynamic("facebook")(facebook)
    if (!js.isUndefined(noindex)) __obj.updateDynamic("noindex")(noindex)
    if (openGraph != null) __obj.updateDynamic("openGraph")(openGraph)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate)
    if (twitter != null) __obj.updateDynamic("twitter")(twitter)
    __obj.asInstanceOf[Config]
  }
}

