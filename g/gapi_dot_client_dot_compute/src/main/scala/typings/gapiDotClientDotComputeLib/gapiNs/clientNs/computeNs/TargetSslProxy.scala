package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxy extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#targetSslProxy for target SSL proxies. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** URL to the BackendService resource. */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /** URLs to SslCertificate resources that are used to authenticate connections to Backends. Currently exactly one SSL certificate must be specified. */
  var sslCertificates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TargetSslProxy {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    proxyHeader: java.lang.String = null,
    selfLink: java.lang.String = null,
    service: java.lang.String = null,
    sslCertificates: js.Array[java.lang.String] = null
  ): TargetSslProxy = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (service != null) __obj.updateDynamic("service")(service)
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates)
    __obj.asInstanceOf[TargetSslProxy]
  }
}

