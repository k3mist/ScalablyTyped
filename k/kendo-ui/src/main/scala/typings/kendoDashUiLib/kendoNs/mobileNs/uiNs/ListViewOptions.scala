package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var appendOnRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ ListViewClickEvent, scala.Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.DataSource | js.Any] = js.undefined
  var endlessScroll: js.UndefOr[scala.Boolean] = js.undefined
  var filterable: js.UndefOr[scala.Boolean | ListViewFilterable] = js.undefined
  var fixedHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var itemChange: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var loadMore: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[ListViewMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pullParameters: js.UndefOr[js.Function] = js.undefined
  var pullToRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var virtualViewSize: js.UndefOr[scala.Double] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    appendOnRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    click: js.Function1[/* e */ ListViewClickEvent, scala.Unit] = null,
    dataBinding: js.Function1[/* e */ ListViewEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ ListViewEvent, scala.Unit] = null,
    dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource | js.Any = null,
    endlessScroll: js.UndefOr[scala.Boolean] = js.undefined,
    filterable: scala.Boolean | ListViewFilterable = null,
    fixedHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    headerTemplate: java.lang.String | js.Function = null,
    itemChange: js.Function1[/* e */ ListViewEvent, scala.Unit] = null,
    loadMore: js.UndefOr[scala.Boolean] = js.undefined,
    messages: ListViewMessages = null,
    name: java.lang.String = null,
    pullParameters: js.Function = null,
    pullToRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    `type`: java.lang.String = null,
    virtualViewSize: scala.Int | scala.Double = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendOnRefresh)) __obj.updateDynamic("appendOnRefresh")(appendOnRefresh)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (click != null) __obj.updateDynamic("click")(click)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(endlessScroll)) __obj.updateDynamic("endlessScroll")(endlessScroll)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeaders)) __obj.updateDynamic("fixedHeaders")(fixedHeaders)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (itemChange != null) __obj.updateDynamic("itemChange")(itemChange)
    if (!js.isUndefined(loadMore)) __obj.updateDynamic("loadMore")(loadMore)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pullParameters != null) __obj.updateDynamic("pullParameters")(pullParameters)
    if (!js.isUndefined(pullToRefresh)) __obj.updateDynamic("pullToRefresh")(pullToRefresh)
    if (style != null) __obj.updateDynamic("style")(style)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (virtualViewSize != null) __obj.updateDynamic("virtualViewSize")(virtualViewSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewOptions]
  }
}

