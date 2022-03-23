package alfa.Test.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "page", "per_page", "total", "total_pages", "data", "support" })
@Generated("jsonschema2pojo")
public class UserList {

	@JsonProperty("page")
	private Integer page;
	@JsonProperty("per_page")
	private Integer perPage;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("total_pages")
	private Integer totalPages;
	@JsonProperty("data")
	private List<Data> data = null;
	@JsonProperty("support")
	private Support support;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("page")
	public Integer getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(Integer page) {
		this.page = page;
	}

	@JsonProperty("per_page")
	public Integer getPerPage() {
		return perPage;
	}

	@JsonProperty("per_page")
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("total_pages")
	public Integer getTotalPages() {
		return totalPages;
	}

	@JsonProperty("total_pages")
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@JsonProperty("data")
	public List<Data> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<Data> data) {
		this.data = data;
	}

	@JsonProperty("support")
	public Support getSupport() {
		return support;
	}

	@JsonProperty("support")
	public void setSupport(Support support) {
		this.support = support;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("page");
		sb.append('=');
		sb.append(((this.page == null) ? "<null>" : this.page));
		sb.append(',');
		sb.append("perPage");
		sb.append('=');
		sb.append(((this.perPage == null) ? "<null>" : this.perPage));
		sb.append(',');
		sb.append("total");
		sb.append('=');
		sb.append(((this.total == null) ? "<null>" : this.total));
		sb.append(',');
		sb.append("totalPages");
		sb.append('=');
		sb.append(((this.totalPages == null) ? "<null>" : this.totalPages));
		sb.append(',');
		sb.append("data");
		sb.append('=');
		sb.append(((this.data == null) ? "<null>" : this.data));
		sb.append(',');
		sb.append("support");
		sb.append('=');
		sb.append(((this.support == null) ? "<null>" : this.support));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
