import { useList } from "@pankod/refine-core";
import { Typography, Box, Stack } from "@pankod/refine-mui";

import { AxisModel, Category, ChartComponent, Inject, LineSeries, SeriesCollectionDirective, SeriesDirective} from'@syncfusion/ej2-react-charts';


import {
    PieChart,
    PropertyReferrals,
    TotalRevenue,
    PropertyCard,

} from "components";

const Home = () => {
    const { data, isLoading, isError } = useList({
        resource: "properties",
        config: {
            pagination: {
                pageSize: 4,
            },
        },
    });

    const latestProperties = data?.data ?? [];

    if (isLoading) return <Typography>Loading...</Typography>;
    if (isError) return <Typography>Something went wrong!</Typography>;

    return (
        <Box>
            <Typography fontSize={25} fontWeight={700} color="#fcfcfc">
                Patient Dashboard
            </Typography>

            <Box mt="20px" display="flex" flexWrap="wrap" gap={4}>
                <PieChart
                    title="Heart Rate"
                    value={70}
                    series={[75, 25]}
                    colors={["#275be8", "#c4e8ef"]}
                />
                <PieChart
                    title="SPO2"
                    value={98}
                    series={[60, 40]}
                    colors={["#275be8", "#c4e8ef"]}
                />
                <PieChart
                    title="Total Steps today"
                    value={4833}
                    series={[75, 25]}
                    colors={["#275be8", "#c4e8ef"]}
                />
                {/* <PieChart
                    title="Properties for Cities"
                    value={555}
                    series={[75, 25]}
                    colors={["#275be8", "#c4e8ef"]}
                /> */}
            </Box>

            <Stack
                mt="35px"
                fontWeight={900}
                color="#fcfcfc"
                width="100%"
                justifyContent="center"
                direction={{ xs: "column", lg: "row" }}
                gap={6}
            >
                <TotalRevenue />
        
                <PropertyReferrals />
            </Stack>

            <Box
                flex={1}
                borderRadius="15px"
                padding="20px"
                bgcolor="#fcfcfc"
                display="flex"
                flexDirection="column"
                minWidth="100%"
                mt="25px"
            >
                <Typography fontSize="18px" fontWeight={600} color="#11142d">
                    User Profile 
                </Typography>
                <Typography fontSize="18px" fontWeight={600} color="#11142d">
                    Name : Mahir Jain
                </Typography>
                <Typography fontSize="18px" fontWeight={600} color="#11142d">
                    Age : 18
                </Typography>
                <Box
                    mt={2.5}
                    sx={{ display: "flex", flexWrap: "wrap", gap: 4 }}
                >
                    {latestProperties.map((property) => (
                        <PropertyCard
                            key={property._id}
                            id={property._id}
                            title={property.title}
                            location={property.location}
                            price={property.price}
                            photo={property.photo}
                        />
                    ))}
                </Box>
            </Box>
        </Box>
    );
};

export default Home;
