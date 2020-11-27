// Static content examples. These lists can be generated dynamically as an alternative.
List devList    = ["Select:selected", "dev1", "dev2"]
List testList   = ["Select:selected", "test1", "test2", "test3"]
List stageList  = ["Select:selected", "stage1"]
List prodList   = ["Select:selected", "prod1", "prod2", "prod3", "prod4"]


List default_item = ["None"]

if (Environment.equals('DEV')) {
  return devList
} else if (Environment.equals('TEST')) {
  return testList
} else if (Environment.equals('STAGE')) {
  return stageList
} else if (Environment.equals('PROD')) {
  return prodList
} else {
  return default_item
}

