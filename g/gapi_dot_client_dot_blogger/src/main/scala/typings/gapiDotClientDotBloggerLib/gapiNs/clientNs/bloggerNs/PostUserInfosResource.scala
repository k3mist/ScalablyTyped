package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyMaxComments): gapiDotClientLib.gapiNs.clientNs.Request[PostUserInfo]
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodiesFields): gapiDotClientLib.gapiNs.clientNs.Request[PostUserInfosList]
}

object PostUserInfosResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyMaxComments, 
      gapiDotClientLib.gapiNs.clientNs.Request[PostUserInfo]
    ],
    list: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodiesFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PostUserInfosList]
    ]
  ): PostUserInfosResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[PostUserInfosResource]
  }
}

