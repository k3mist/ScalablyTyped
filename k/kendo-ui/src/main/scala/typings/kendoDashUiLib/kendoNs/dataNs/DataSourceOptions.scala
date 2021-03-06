package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceOptions extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceAggregateItem]] = js.undefined
  var autoSync: js.UndefOr[scala.Boolean] = js.undefined
  var batch: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DataSourceChangeEvent, scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ DataSourceErrorEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[DataSourceGroupItem | js.Array[DataSourceGroupItem]] = js.undefined
  var inPlaceSort: js.UndefOr[scala.Boolean] = js.undefined
  var offlineStorage: js.UndefOr[js.Any] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var push: js.UndefOr[js.Function1[/* e */ DataSourcePushEvent, scala.Unit]] = js.undefined
  var requestEnd: js.UndefOr[js.Function1[/* e */ DataSourceRequestEndEvent, scala.Unit]] = js.undefined
  var requestStart: js.UndefOr[js.Function1[/* e */ DataSourceRequestStartEvent, scala.Unit]] = js.undefined
  var schema: js.UndefOr[DataSourceSchema] = js.undefined
  var serverAggregates: js.UndefOr[scala.Boolean] = js.undefined
  var serverFiltering: js.UndefOr[scala.Boolean] = js.undefined
  var serverGrouping: js.UndefOr[scala.Boolean] = js.undefined
  var serverPaging: js.UndefOr[scala.Boolean] = js.undefined
  var serverSorting: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var sync: js.UndefOr[js.Function1[/* e */ DataSourceEvent, scala.Unit]] = js.undefined
  var transport: js.UndefOr[DataSourceTransport] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceOptions {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceAggregateItem] = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    batch: js.UndefOr[scala.Boolean] = js.undefined,
    change: /* e */ DataSourceChangeEvent => scala.Unit = null,
    data: js.Any = null,
    error: /* e */ DataSourceErrorEvent => scala.Unit = null,
    filter: js.Any = null,
    group: DataSourceGroupItem | js.Array[DataSourceGroupItem] = null,
    inPlaceSort: js.UndefOr[scala.Boolean] = js.undefined,
    offlineStorage: js.Any = null,
    page: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    push: /* e */ DataSourcePushEvent => scala.Unit = null,
    requestEnd: /* e */ DataSourceRequestEndEvent => scala.Unit = null,
    requestStart: /* e */ DataSourceRequestStartEvent => scala.Unit = null,
    schema: DataSourceSchema = null,
    serverAggregates: js.UndefOr[scala.Boolean] = js.undefined,
    serverFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    serverGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    serverPaging: js.UndefOr[scala.Boolean] = js.undefined,
    serverSorting: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Any = null,
    sync: /* e */ DataSourceEvent => scala.Unit = null,
    transport: DataSourceTransport = null,
    `type`: java.lang.String = null
  ): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceSort)) __obj.updateDynamic("inPlaceSort")(inPlaceSort)
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1(push))
    if (requestEnd != null) __obj.updateDynamic("requestEnd")(js.Any.fromFunction1(requestEnd))
    if (requestStart != null) __obj.updateDynamic("requestStart")(js.Any.fromFunction1(requestStart))
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(serverAggregates)) __obj.updateDynamic("serverAggregates")(serverAggregates)
    if (!js.isUndefined(serverFiltering)) __obj.updateDynamic("serverFiltering")(serverFiltering)
    if (!js.isUndefined(serverGrouping)) __obj.updateDynamic("serverGrouping")(serverGrouping)
    if (!js.isUndefined(serverPaging)) __obj.updateDynamic("serverPaging")(serverPaging)
    if (!js.isUndefined(serverSorting)) __obj.updateDynamic("serverSorting")(serverSorting)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceOptions]
  }
}

