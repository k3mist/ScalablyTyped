package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportWithObjectOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportCreate] = js.undefined
  @JSName("destroy")
  var destroy_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportDestroy] = js.undefined
  @JSName("read")
  var read_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.undefined
  @JSName("update")
  var update_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportUpdate] = js.undefined
}

object DataSourceTransportWithObjectOperations {
  @scala.inline
  def apply(
    create: DataSourceTransportCreate = null,
    destroy: DataSourceTransportDestroy = null,
    parameterMap: js.Function2[/* data */ DataSourceTransportParameterMapData, /* type */ java.lang.String, _] = null,
    push: js.Function = null,
    read: DataSourceTransportRead = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null,
    submit: js.Function = null,
    update: DataSourceTransportUpdate = null
  ): DataSourceTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(parameterMap)
    if (push != null) __obj.updateDynamic("push")(push)
    if (read != null) __obj.updateDynamic("read")(read)
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSourceTransportWithObjectOperations]
  }
}

