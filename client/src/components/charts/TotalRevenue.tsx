import ReactApexChart from "react-apexcharts";
import { Box, Typography, Stack } from "@pankod/refine-mui";
import { ArrowCircleUpRounded } from "@mui/icons-material";

import { TotalRevenueOptions, TotalRevenueSeries } from "./chart.config";


import { AxisModel, Category, ChartComponent, Inject, LineSeries, SeriesCollectionDirective, SeriesDirective} from '@syncfusion/ej2-react-charts';
import * as React from 'react';

class TotalRevenue extends React.Component<{}, {}> {
  public primaryXAxis: AxisModel = { valueType: 'Category'};
  public data : any[]= [{ x: '9 am', y: 38.3, text: 'World Wide' },
  { x: 'noon', y: 45.2, text: 'Europe' },
  { x: '2 pm', y: 18.2, text: 'Asia Pacific' },
  { x: '4 pm', y: 46.7, text: 'Latin America' },
  { x: '7 pm', y: 61.5, text: 'Middle East Africa' },
  { x: '10 pm', y: 64, text: 'North America' }];
 
  public render() {
    return <ChartComponent id='charts' primaryXAxis={this.primaryXAxis} >
      <Inject services={[LineSeries, Category]} />
      <SeriesCollectionDirective>
      <SeriesDirective dataSource={this.data} xName='x' yName='y' type='Line'/>
      </SeriesCollectionDirective>
    </ChartComponent>
  }
};

// const TotalRevenue = () => {
//     return (
//         <Box
//             p={4}
//             flex={1}
//             bgcolor="#fcfcfc"
//             id="chart"
//             display="flex"
//             flexDirection="column"
//             borderRadius="15px"
//         >
//             <Typography fontSize={18} fontWeight={600} color="#11142d">
//                 Total Revenue
//             </Typography>

//             <Stack my="20px" direction="row" gap={4} flexWrap="wrap">
//                 <Typography fontSize={28} fontWeight={700} color="#11142d">
//                     $236,535
//                 </Typography>
//                 <Stack direction="row" alignItems="center" gap={1}>
//                     <ArrowCircleUpRounded
//                         sx={{ fontSize: 25, color: "#475be8" }}
//                     />
//                     <Stack>
//                         <Typography fontSize={15} color="#475be8">
//                             0.8%
//                         </Typography>
//                         <Typography fontSize={12} color="#808191">
//                             Than Last Month
//                         </Typography>
//                     </Stack>
//                 </Stack>
//             </Stack>

//             <ReactApexChart
//                 series={TotalRevenueSeries}
//                 type="bar"
//                 height={310}
//                 options={TotalRevenueOptions}
//             />
//         </Box>
//     );
// };

export default TotalRevenue;
