package typings
package expressDashHttpDashProxyLib.expressDashHttpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ nodeLib.httpMod.RequestOptions, 
      /* srcReq */ expressLib.expressMod.eNs.Request, 
      nodeLib.httpMod.RequestOptions
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]] = js.undefined
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ nodeLib.httpMod.IncomingHttpHeaders, 
      /* userReq */ expressLib.expressMod.eNs.Request, 
      /* userRes */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* proxyReq */ expressLib.expressMod.eNs.Request, 
      /* proxyRes */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      nodeLib.httpMod.OutgoingHttpHeaders
    ]
  ] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    proxyReqOptDecorator: js.Function2[
      /* proxyReqOpts */ nodeLib.httpMod.RequestOptions, 
      /* srcReq */ expressLib.expressMod.eNs.Request, 
      nodeLib.httpMod.RequestOptions
    ] = null,
    proxyReqPathResolver: js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String] = null,
    userResHeaderDecorator: js.Function5[
      /* headers */ nodeLib.httpMod.IncomingHttpHeaders, 
      /* userReq */ expressLib.expressMod.eNs.Request, 
      /* userRes */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* proxyReq */ expressLib.expressMod.eNs.Request, 
      /* proxyRes */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      nodeLib.httpMod.OutgoingHttpHeaders
    ] = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (proxyReqOptDecorator != null) __obj.updateDynamic("proxyReqOptDecorator")(proxyReqOptDecorator)
    if (proxyReqPathResolver != null) __obj.updateDynamic("proxyReqPathResolver")(proxyReqPathResolver)
    if (userResHeaderDecorator != null) __obj.updateDynamic("userResHeaderDecorator")(userResHeaderDecorator)
    __obj.asInstanceOf[ProxyOptions]
  }
}

