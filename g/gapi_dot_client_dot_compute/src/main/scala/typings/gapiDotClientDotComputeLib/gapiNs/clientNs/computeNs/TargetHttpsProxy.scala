package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxy extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. Currently, exactly one SSL certificate
    * must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are
    * all valid URLs for specifying a URL map:
    * - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map
    * - projects/project/global/urlMaps/url-map
    * - global/urlMaps/url-map
    */
  var urlMap: js.UndefOr[java.lang.String] = js.undefined
}

object TargetHttpsProxy {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    selfLink: java.lang.String = null,
    sslCertificates: js.Array[java.lang.String] = null,
    urlMap: java.lang.String = null
  ): TargetHttpsProxy = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates)
    if (urlMap != null) __obj.updateDynamic("urlMap")(urlMap)
    __obj.asInstanceOf[TargetHttpsProxy]
  }
}

