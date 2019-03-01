package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appid extends js.Object {
  var app_id: java.lang.String
  			// 应用id
  var auth_code: java.lang.String
  		// 会员卡表单信息请求Id
  var out_string: java.lang.String
  	// 会员卡模板Id
  var request_id: java.lang.String
  			// 授权的state
  var scope: java.lang.String
  		// 授权码，用于换取authtoken
  var state: java.lang.String
  			// 授权scope
  var template_id: java.lang.String
}

object Anon_Appid {
  @scala.inline
  def apply(
    app_id: java.lang.String,
    auth_code: java.lang.String,
    out_string: java.lang.String,
    request_id: java.lang.String,
    scope: java.lang.String,
    state: java.lang.String,
    template_id: java.lang.String
  ): Anon_Appid = {
    val __obj = js.Dynamic.literal(app_id = app_id, auth_code = auth_code, out_string = out_string, request_id = request_id, scope = scope, state = state, template_id = template_id)
  
    __obj.asInstanceOf[Anon_Appid]
  }
}

