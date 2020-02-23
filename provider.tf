provider "grafana" {
  //url = "http//localhost:3000"
  //auth = APIkey with admin role
}


resource "grafana_dashboard" "metrics" {
  config_json = "${file("grafana-dashboard.json")}"
}


resource "grafana_data_source" "influxdb" {
  name = "exam_influxdb"
  type = "influxdb"
  url  = "http://localhost:8086"
}
