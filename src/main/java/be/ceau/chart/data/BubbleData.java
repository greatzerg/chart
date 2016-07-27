package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

public class BubbleData {

	/**
	 * The data to plot as bubbles. See Data format
	 */
	private List<BigDecimal> data;

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	private String label;

	/**
	 * The fill color of the bubbles. See Colors
	 */
	private List<Color> backgroundColor;

	/**
	 * The stroke color of the bubbles.
	 */
	private List<Color> borderColor;

	/**
	 * The stroke width of bubble in pixels.
	 */
	private List<BigDecimal> borderWidth;

	/**
	 * The fill color of the bubbles when hovered.
	 */
	private List<Color> hoverBackgroundColor;

	/**
	 * The stroke color of the bubbles when hovered.
	 */
	private List<Color> hoverBorderColor;

	/**
	 * The stroke width of the bubbles when hovered.
	 */
	private List<BigDecimal> hoverBorderWidth;

	/**
	 * Additional radius to add to data radius on hover.
	 */
	private List<BigDecimal> hoverRadius;

	public List<BigDecimal> getData() {
		return data;
	}

	public void setData(List<BigDecimal> data) {
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Color> getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(List<Color> backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public List<Color> getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(List<Color> borderColor) {
		this.borderColor = borderColor;
	}

	public List<BigDecimal> getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(List<BigDecimal> borderWidth) {
		this.borderWidth = borderWidth;
	}

	public List<Color> getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

	public List<Color> getHoverBorderColor() {
		return hoverBorderColor;
	}

	public void setHoverBorderColor(List<Color> hoverBorderColor) {
		this.hoverBorderColor = hoverBorderColor;
	}

	public List<BigDecimal> getHoverBorderWidth() {
		return hoverBorderWidth;
	}

	public void setHoverBorderWidth(List<BigDecimal> hoverBorderWidth) {
		this.hoverBorderWidth = hoverBorderWidth;
	}

	public List<BigDecimal> getHoverRadius() {
		return hoverRadius;
	}

	public void setHoverRadius(List<BigDecimal> hoverRadius) {
		this.hoverRadius = hoverRadius;
	}
	
}
